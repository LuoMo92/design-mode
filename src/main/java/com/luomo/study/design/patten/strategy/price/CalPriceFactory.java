package com.luomo.study.design.patten.strategy.price;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

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
        Double totalAmount = customer.getTotalAmount();
        //在策略列表中查找策略
        for (Class<? extends CalPrice> clazz : calPriceList) {
            TotalValidRegion totalValidRegion = handleAnnotation(clazz);
            if (totalAmount >= totalValidRegion.min() && totalAmount <= totalValidRegion.max()) {
                try {
                    return clazz.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new RuntimeException("策略获得失败");
    }

    private TotalValidRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return null;
        }
        for (int i = 0; i < declaredAnnotations.length; i++) {
            if (declaredAnnotations[i] instanceof TotalValidRegion) {
                return (TotalValidRegion) declaredAnnotations[i];
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
