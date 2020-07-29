package com.gupao.pattern.singleton.hungry;

/**
 * 饿汉式
 *
 * @author maoenqi
 * @date 2020/7/29
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}