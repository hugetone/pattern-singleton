package com.gsunis.pattern.singleton.seriable;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

import java.io.Serializable;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : SeriableSingleton
 * @Creation Date : 2019/3/18 9:31 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class SeriableSingleton implements Serializable {

    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton (){}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }


}
