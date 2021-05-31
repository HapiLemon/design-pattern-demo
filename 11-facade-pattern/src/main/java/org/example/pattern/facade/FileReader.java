package org.example.pattern.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author keminfeng
 * @date 2021-05-31 22:11
 */
public class FileReader {

    public String read(String fileNameSrc) {
        System.out.print("读取文件，获取明文：");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inFS.read()) != -1) {
                sb = sb.append((char) data);
            }
            inFS.close();
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
        return sb.toString();
    }

}
