package com.gupao.pattern.singleton.hungry;

/**
 * 饿汉式
 *
 * @author maoenqi
 * @date 2020/7/29
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}