package com.luomo.study.design.patten.strategy.price;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public class CalPriceFactory {

    /**
     * 表示扫描策略的包
     */
    private static final String CAL_PRICE_PACKAGE = "com.luomo.study.design.patten.strategy.price";

    /**
     * 加载策略时的类加载器，我们任何类运行时信息必须来自该类加载器
     */
    private ClassLoader classLoader = getClass().getClassLoader();

    /**
     * 策略列表
     */
    private List<Class<? extends CalPrice>> calPriceList;

    /**
     * 根据客户的总金额产生相应的策略
     *
     * @param customer
     * @return
     */
    public CalPrice createCalPrice(Customer customer) {
        /**
         * 为了支持优先级排序，采用可排序的MAP支持
         * 这个MAP事为了储存我们当前策略的运行时类信息
         */
        SortedMap<Integer, Class<? extends CalPrice>> classSortedMap = new TreeMap<>();

        Double totalAmount = customer.getTotalAmount();
        Double amount = customer.getAmount();
        //在策略列表中查找策略
        for (Class<? extends CalPrice> clazz : calPriceList) {
            Annotation annotation = handleAnnotation(clazz);
            if (annotation instanceof TotalValidRegion) {
                TotalValidRegion totalValidRegion = (TotalValidRegion) annotation;
                //判断总金额是否在注解的区间
                if (totalAmount >= totalValidRegion.value().min() && totalAmount <= totalValidRegion.value().max()) {
                    //将采用的策略放入MAP
                    classSortedMap.put(totalValidRegion.value().order(),clazz);
                }
            } else if (annotation instanceof OnceValidRegion) {
                OnceValidRegion onceValidRegion = (OnceValidRegion) annotation;
                //判断单次金额是否在注解的区间，注意这次判断的是客户当次消费的金额
                if (amount >= onceValidRegion.value().min() && amount <= onceValidRegion.value().max()) {
                    classSortedMap.put(onceValidRegion.value().order(),clazz);
                }
            }
        }
       return CalPriceProxy.getProxy(classSortedMap);
    }

    /**
     * 传入策略类，返回它的注解
     * TotalValidRegion OnceValidRegion两种注解
     *
     * @param clazz
     * @return
     */
    private Annotation handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return null;
        }
        for (int i = 0; i < declaredAnnotations.length; i++) {
            if (declaredAnnotations[i] instanceof TotalValidRegion || declaredAnnotations[i] instanceof OnceValidRegion) {
                return declaredAnnotations[i];
            }
        }
        return null;
    }

    /**
     * 单例
     */
    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance {

        private static CalPriceFactory instance = new CalPriceFactory();
    }

    private CalPriceFactory() {
        init();
    }

    /**
     * 在工厂初始化时要初始化策略列表
     */
    private void init() {
        calPriceList = new ArrayList<>();
        File[] resources = getResources();
        Class<CalPrice> calPriceClass = null;
        try {
            //使用相同的加载器加载策略接口
            calPriceClass = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < resources.length; i++) {
            try {
                //载入包下的类
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resources[i].getName().replace(".class", ""));
                //判断是否是CalPrice的实现类并且不是CalPrice本身，满足的话加入到策略列表
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClass) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取扫描的包下面所有的class文件
     *
     * @return
     */
    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(pathname -> {
                if (pathname.getName().endsWith(".class")) {
                    return true;
                }
                return false;
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("未找到策略资源");
        }
    }
}
