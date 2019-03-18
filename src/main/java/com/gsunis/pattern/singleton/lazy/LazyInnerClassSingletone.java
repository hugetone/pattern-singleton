package com.gsunis.pattern.singleton.lazy;

/**
 * 描述 ：通过内部类实现单例模式，该实现方式是线程安全的
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : LazyInnerClassSingletone
 * @Creation Date : 2019/3/18 9:10 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class LazyInnerClassSingletone {

    private LazyInnerClassSingletone(){
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static final LazyInnerClassSingletone getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingletone LAZY = new LazyInnerClassSingletone();
    }
}
