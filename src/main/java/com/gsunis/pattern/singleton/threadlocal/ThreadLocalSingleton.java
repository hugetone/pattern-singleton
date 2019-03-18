package com.gsunis.pattern.singleton.threadlocal;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : ThreadLocalSingleton
 * @Creation Date : 2019/3/18 11:57 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingleton.get();
    }
}
