package com.gupao.pattern.proxy.staticp;

import com.gupao.pattern.proxy.Person;

/**
 * com.gupao.pattern.proxy.staticp
 *
 * @author maoenqi
 * @date 2020/8/4
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子找对象");
    }
}