package com.gupao.pattern.singleton.lazy;

import java.io.Serializable;

/**
 * com.gupao.pattern.singleton.lazy
 *
 * @author maoenqi
 * @date 2020/7/29
 */
public class LazyDoubleCheckSingleton implements Serializable {
    private static final long serialVersionUID = -9175701145545131988L;
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    /**
     * 防止序列化破解单例
     *
     * @return
     */
    private Object readResolve() {
        return lazyDoubleCheckSingleton;
    }
}