package com.gsunis.pattern.singleton.singleton;

import com.gsunis.pattern.singleton.register.EnumSingleton;

import java.io.*;

/**
 * 描述 ：
 *
 * @author : zhaowj
 * @version : v1.00
 * @ClassName : EnumSingletonTest
 * @Creation Date : 2019/3/18 11:35 PM
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class EnumSingletonTest {

    public static void main(String[] args) {

        EnumSingleton s1 = null;

        EnumSingleton s2 = EnumSingleton.getInstance();

        s2.setData(new Pojo());

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());


        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
