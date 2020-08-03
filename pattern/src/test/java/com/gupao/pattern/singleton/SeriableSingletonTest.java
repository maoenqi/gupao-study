package com.gupao.pattern.singleton;

import com.gupao.pattern.singleton.lazy.LazyDoubleCheckSingleton;

import java.io.*;

/**
 * 序列化破解单例测试
 */
public class SeriableSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        FileOutputStream fileOutputStream = new FileOutputStream("SeriableSingleton.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(lazyDoubleCheckSingleton);
        objectOutputStream.flush();
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("SeriableSingleton.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(lazyDoubleCheckSingleton);
        System.out.println(o);
    }
}