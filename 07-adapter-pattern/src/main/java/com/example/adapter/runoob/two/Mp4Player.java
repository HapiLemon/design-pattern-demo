package com.example.adapter.runoob.two;

/**
 * 后来增加的接口的实现类 专用于播放mp4
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. name = " + fileName);
    }
}
