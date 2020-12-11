package com.example.adapter.runoob.two;

import com.example.adapter.runoob.one.MediaPlayer;

/**
 * 为了对新增的两个实现类进行选择
 * 而增加的适配器
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 构造方法 根据入参决定 成员变量装配哪个实现类
     * @param audioType
     */
    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer=new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer=new Mp4Player();
        }
    }

    /**
     * 播放方法
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
