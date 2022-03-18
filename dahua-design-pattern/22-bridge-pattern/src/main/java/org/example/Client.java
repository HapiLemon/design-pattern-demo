package org.example;

import org.example.abstraction.MiPhone;
import org.example.abstraction.Phone;
import org.example.implentor.MediaPlayer;

/**
 * @author keminfeng
 * @date 2022-03-18 17:20
 */
public class Client {
    public static void main(String[] args) {
        Phone miPhone = new MiPhone();
        miPhone.setSoft(new MediaPlayer());
        miPhone.run();
    }
}
