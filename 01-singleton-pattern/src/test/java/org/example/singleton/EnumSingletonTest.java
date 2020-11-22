package org.example.singleton;

import java.io.*;

public class EnumSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton6.INSTANCE.whateverMethod();
        // 简单引用
        Singleton6 instance0 = Singleton6.INSTANCE;
        Singleton6 instance1 = Singleton6.INSTANCE;
        System.out.println("instance0===" + instance0.hashCode());
        System.out.println("instance1===" + instance1.hashCode());
        // 反射测试
        Class clazz = Singleton6.class;
        Singleton6 instance2 = (Singleton6) Enum.valueOf(clazz, "INSTANCE");
        Singleton6 instance3 = (Singleton6) Enum.valueOf(clazz, "INSTANCE");
        System.out.println("instance2===" + instance2.hashCode());
        System.out.println("instance3===" + instance3.hashCode());
        // 序列化测试
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("test")));
        oos.writeObject(instance0);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("test")));
        Singleton6 instance4 = (Singleton6) ois.readObject();
        ois.close();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(new File("test")));
        Singleton6 instance5 = (Singleton6) ois1.readObject();
        ois1.close();
        System.out.println("instance4===" + instance4.hashCode());
        System.out.println("instance5===" + instance5.hashCode());
    }


}
