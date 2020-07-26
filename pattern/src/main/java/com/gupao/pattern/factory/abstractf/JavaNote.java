package com.gupao.pattern.factory.abstractf;

/**
 * com.gupao.pattern.factory.abstractf
 *
 * @author maoenqi
 * @date 2020/7/26
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}