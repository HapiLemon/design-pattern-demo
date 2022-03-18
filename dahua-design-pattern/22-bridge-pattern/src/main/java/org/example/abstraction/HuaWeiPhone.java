package org.example.abstraction;

/**
 * @author keminfeng
 * @date 2022-03-18 17:03
 */
public class HuaWeiPhone extends Phone {
    @Override
    public void run() {
        System.out.print("华为手机");
        this.software.run();
    }
}
