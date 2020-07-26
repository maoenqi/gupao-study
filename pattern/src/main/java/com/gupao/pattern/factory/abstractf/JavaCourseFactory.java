package com.gupao.pattern.factory.abstractf;

/**
 * com.gupao.pattern.factory.abstractf
 *
 * @author maoenqi
 * @date 2020/7/26
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}