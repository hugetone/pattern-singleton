package com.gsunis.pattern.singleton.singleton;

import com.gsunis.pattern.singleton.lazy.LazySimpleSingleton;
import com.gsunis.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : ExectorThread
 * @Creation Date : 2019/3/12 11:22 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class ExectorThread implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();

        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalSingleton.getInstance());

    }
}
