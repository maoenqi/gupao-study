package com.gupao.pattern.singleton.lazy;

/**
 * 懒汉式内部类方式
 * 兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 *
 * @author maoenqi
 * @date 2020/7/29
 */
public class LazyInnerClassSingleton {

    /**
     * 默认使用LazyInnerClassGeneral的时候，会先初始化内部类
     * 如果没使用的话，内部类是不加载的
     */
    private LazyInnerClassSingleton() {
        // 屏蔽反射
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * static 是为了使单例的空间共享
     * 保证这个方法不会被重写，重载
     *
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        // 在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}