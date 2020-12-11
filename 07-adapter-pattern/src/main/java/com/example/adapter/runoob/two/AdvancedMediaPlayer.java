package com.example.adapter.runoob.two;

/**
 * 后来增加的高级播放器
 */
public interface AdvancedMediaPlayer {
    /**
     * 播放vlc
     * @param fileName
     */
    public void playVlc(String fileName);

    /**
     * 播放mp4
     * @param fileName
     */
    public void playMp4(String fileName);
}
