package com.luomo.study.design.patten.singleton.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.luomo.study.design.patten.singleton.SyncSingleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * 测试同步instance为空的部分代码
 *
 * 深入到JVM层考虑(可能)会有问题
 *
 * 如果JVM调优调整指令的执行顺序的话...
 *
 * http://www.cnblogs.com/zuoxiaolong/p/pattern2.html
 *
 * @author LiuMei
 * @date 2017-11-24.
 */
public class TestSyncSingleton {


    boolean lock;

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
        final TestSyncSingleton lock = new TestSyncSingleton();
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
                        SyncSingleton singleton = SyncSingleton.getInstance();
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
