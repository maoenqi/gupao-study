package com.gupao.pattern.proxy.staticp;

import com.gupao.pattern.proxy.Person;

/**
 * com.gupao.pattern.proxy.staticp
 *
 * @author maoenqi
 * @date 2020/8/4
 */
public class Father implements Person {

    private Son person;

    public Father(Son person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("父亲物色对象");
        person.findLove();
    }
}