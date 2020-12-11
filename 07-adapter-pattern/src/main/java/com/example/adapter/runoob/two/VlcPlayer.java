package com.example.adapter.runoob.two;

/**
 * 后来增加的接口的实现类 专用于播放vlc
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. name = " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
