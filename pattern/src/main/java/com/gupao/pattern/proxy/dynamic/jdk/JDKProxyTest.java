package com.gupao.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Method;

/**
 * com.gupao.pattern.proxy.dynamic.jdk
 *
 * @author maoenqi
 * @date 2020/8/4
 */
public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
        Object instance = new JDKMeipo().getInstance(new Girl());
//        Girl girl = (Girl) instance;
//        girl.findLove();
        Method method = instance.getClass().getMethod("findLove", null);
        method.invoke(instance);
    }
}