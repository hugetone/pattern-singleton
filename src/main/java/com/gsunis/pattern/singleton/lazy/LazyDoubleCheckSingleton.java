package com.gsunis.pattern.singleton.lazy;

/**
 * 描述 ：volatile 关键字可以保证该单例的正确行，防止指令重排，该写法是线程安全的。
 * 但是该写法会有被反序列化攻击的问题
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : LazyDoubleCheckSingleton
 * @Creation Date : 2019/3/18 8:57 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton (){}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
