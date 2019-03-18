package com.gsunis.pattern.singleton.singleton;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : LazySimpleSingletonTest
 * @Creation Date : 2019/3/12 11:55 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("END");
    }

}
