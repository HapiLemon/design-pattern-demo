package org.example.client;

/**
 * @author keminfeng
 */
public class Client {

    public static void main(String[] args) {
        int result = new Calculator("1+2*3-(6-1)").calculate();
        System.out.println(result);
    }

}
