package com.luomo.study.design.mode.singleton.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.luomo.study.design.mode.singleton.BadSyncSingleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * 测试整个getInstance同步
 *
 * 会有一些无谓的等待
 *
 * @author LiuMei
 * @date 2017-11-24.
 */
public class TestBadSyncSingleton {


    boolean lock;

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
        final TestBadSyncSingleton lock = new TestBadSyncSingleton();
        lock.setLock(true);

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024),
                namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 100; i++) {
            //异步执行
            pool.execute(() -> {
                while (true) {
                    System.out.println("====");
                    if (!lock.isLock()) {
                        System.out.println("==**==");
                        BadSyncSingleton singleton = BadSyncSingleton.getInstance();
                        instanceSet.add(singleton.toString());
                        break;
                    }
                }
            });
        }
        //为了给足够的时间让100个线程全部开启
        Thread.sleep(5000);
        lock.setLock(false);
        System.out.println("打开锁");
        //将锁打开以后，保证所有的线程都已经调用了getInstance方法
        Thread.sleep(5000);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : instanceSet) {
            System.out.println(instance);
        }
        pool.shutdown();
    }

}
