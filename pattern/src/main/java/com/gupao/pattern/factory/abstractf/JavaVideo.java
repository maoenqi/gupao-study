package com.gupao.pattern.factory.abstractf;

/**
 * com.gupao.pattern.factory.abstractf
 *
 * @author maoenqi
 * @date 2020/7/26
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
