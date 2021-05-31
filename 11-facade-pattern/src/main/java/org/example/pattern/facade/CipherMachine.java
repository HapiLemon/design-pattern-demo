package org.example.pattern.facade;

/**
 * @author keminfeng
 * @date 2021-05-31 22:35
 */
public interface CipherMachine {
    /**
     * 加密接口
     *
     * @param plainText
     * @return
     */
    String encrypt(String plainText);
}
