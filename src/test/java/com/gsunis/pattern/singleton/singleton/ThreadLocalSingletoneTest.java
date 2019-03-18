package com.gsunis.pattern.singleton.singleton;

import com.gsunis.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : ThreadLocalSingletoneTest
 * @Creation Date : 2019/3/19 12:05 AM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class ThreadLocalSingletoneTest {

    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());

        Thread t2 = new Thread(new ExectorThread());

        t1.start();

        t2.start();

        System.out.println("END");



    }
}
