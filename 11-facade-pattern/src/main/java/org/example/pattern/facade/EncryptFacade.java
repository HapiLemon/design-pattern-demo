package org.example.pattern.facade;

/**
 * @author Bill
 */
public class EncryptFacade {
    // 维持对其他对象的引用
    private static final EncryptFacade encryptFacade = new EncryptFacade("new");
    private final FileReader reader;
    private final CipherMachine cipher;
    private final FileWriter writer;

    private EncryptFacade(String flag) {
        reader = new FileReader();
        writer = new FileWriter();
        cipher = "new".equals(flag) ? new NewCipherMachine() : new OldCipherMachine();
    }

    public static EncryptFacade getEncryptFacade() {
        return encryptFacade;
    }

    // 调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}