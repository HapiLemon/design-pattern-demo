package org.example;

import org.example.proxy.Proxy;

/**
 * @author keminfeng
 * @date 2022-02-10 14:29
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("李娇娇");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDoll();
        proxy.giveFlower();
        proxy.giveChocolate();
    }
}
