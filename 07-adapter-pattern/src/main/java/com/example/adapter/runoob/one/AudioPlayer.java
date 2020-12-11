package com.example.adapter.runoob.one;

import com.example.adapter.runoob.two.MediaAdapter;

/**
 * 最初的接口实现类
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    /**
     * 最初只能播放mp3格式的音乐
     * @param audioType
     * @param fileName
     */
//    @Override
//    public void play(String audioType, String fileName) {
//        if ("mp3".equalsIgnoreCase(audioType)) {
//            System.out.println("Playing mp3 file. Name = " + fileName);
//        } else {
//            System.out.println("Invalid media. " + audioType + " format not supported");
//        }
//    }

    /**
     * 增强后的play方法
     *
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name = " + fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
