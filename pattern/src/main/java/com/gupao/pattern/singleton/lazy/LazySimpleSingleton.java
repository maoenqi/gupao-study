package com.gupao.pattern.singleton.lazy;

/**
 * 懒汉式单例
 *
 * @author maoenqi
 * @date 2020/7/29
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton() {
    }

    public static synchronized LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}