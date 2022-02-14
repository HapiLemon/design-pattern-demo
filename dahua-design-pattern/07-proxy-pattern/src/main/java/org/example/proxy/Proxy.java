package org.example.proxy;

import org.example.SchoolGirl;
import org.example.realsubject.Pursuit;
import org.example.subject.GiveGift;

/**
 * @author keminfeng
 * @date 2022-02-10 14:25
 */
public class Proxy implements GiveGift {

    public Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
