package org.example.pattern.facade;

class Client {
    public static void main(String[] args) {
        EncryptFacade ef = EncryptFacade.getEncryptFacade();
        ef.fileEncrypt("facade/src.txt", "facade/des.txt");
    }
}