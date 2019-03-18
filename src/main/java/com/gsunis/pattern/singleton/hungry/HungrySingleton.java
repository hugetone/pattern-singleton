package com.gsunis.pattern.singleton.hungry;

/**
 * 描述 ：饿汉式单例是线程安全的，在类加载的时候就已经初始化了，并且创建单例对象
 * 优点 ：没有任何的锁、执行效率较高、在用户体验上来说比懒汉式好
 * 缺点 ：类加载的时候就初始化了，不管用与不用都占着空间，浪费空间
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : HungrySingleton
 * @Creation Date : 2019/3/12 11:12 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
