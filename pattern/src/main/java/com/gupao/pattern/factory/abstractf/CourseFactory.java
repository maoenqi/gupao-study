package com.gupao.pattern.factory.abstractf;

/**
 * 抽象工厂主入口
 *
 * @author maoenqi
 * @date 2020/7/26
 */
public interface CourseFactory {

    INote createNote();

    IVideo createVideo();
}