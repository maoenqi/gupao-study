package com.gupao.pattern.factory.method;

import com.gupao.pattern.factory.ICourse;
import com.gupao.pattern.factory.JavaCourse;
import com.gupao.pattern.factory.PythonCourse;

/**
 * com.gupao.pattern.factory.method
 *
 * @author maoenqi
 * @date 2020/7/25
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}