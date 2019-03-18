package com.gsunis.pattern.singleton.lazy;


/**
 * 描述 ：被外部调用的时候才会加载，这种写法存在线程安全问题
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : LazySimpleSingleton
 * @Creation Date : 2019/3/12 11:22 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton() {}

    public static synchronized LazySimpleSingleton getInstance() {
        if(singleton == null) {
            singleton = new LazySimpleSingleton();
        }
        return singleton;
    }

}
