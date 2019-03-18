package com.gsunis.pattern.singleton.singleton;

import com.gsunis.pattern.singleton.lazy.LazyInnerClassSingletone;

import java.lang.reflect.Constructor;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : LazyInnerClassSingleton
 * @Creation Date : 2019/3/18 9:17 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyInnerClassSingletone.class;

            Constructor constructor = clazz.getDeclaredConstructor(null);

            constructor.setAccessible(true);

            Object o1 = constructor.newInstance();

            Object o2 = constructor.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
