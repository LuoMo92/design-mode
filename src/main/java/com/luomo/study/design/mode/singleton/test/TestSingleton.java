package com.luomo.study.design.mode.singleton.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.luomo.study.design.mode.singleton.Singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * 测试标准单例
 *
 * 并发会有创建多个实例的情况
 *
 * @author LiuMei
 * @date 2017-11-24.
 */
public class TestSingleton {

    /**
     * 加volatile关键字解决main方法死循环
     */
    volatile boolean lock;

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
        final TestSingleton lock = new TestSingleton();
        lock.setLock(true);

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024),
                namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 100; i++) {
            //异步执行
            pool.execute(() -> {
                while (true) {
                    if (!lock.isLock()) {
                        Singleton singleton = Singleton.getInstance();
                        instanceSet.add(singleton.toString());
                        break;
                    }
                }
            });
        }
        //为了给足够的时间让100个线程全部开启
        Thread.sleep(5000);
        lock.setLock(false);
        //将锁打开以后，保证所有的线程都已经调用了getInstance方法
        Thread.sleep(5000);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : instanceSet) {
            System.out.println(instance);
        }
        pool.shutdown();
    }

}
