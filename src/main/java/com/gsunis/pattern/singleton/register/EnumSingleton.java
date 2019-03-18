package com.gsunis.pattern.singleton.register;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : EnumSingleton
 * @Creation Date : 2019/3/18 11:33 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
