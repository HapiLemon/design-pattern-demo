package org.example.abstraction;

/**
 * @author keminfeng
 * @date 2022-03-18 17:01
 */
public class MiPhone extends Phone {

    @Override
    public void run() {
        System.out.print("小米手机");
        this.software.run();
    }
}
