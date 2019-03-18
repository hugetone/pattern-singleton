package com.gsunis.pattern.singleton.hungry;

/**
 * 描述 ：使用静态块实现单例
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : HungryStaticSingleton
 * @Creation Date : 2019/3/12 11:17 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {
        return singleton;
    }
}
