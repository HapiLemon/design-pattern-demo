package org.example.realsubject;

import org.example.SchoolGirl;
import org.example.subject.GiveGift;

/**
 * @author keminfeng
 * @date 2022-02-10 14:23
 */
public class Pursuit implements GiveGift {

    public SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDoll() {
        System.out.println(this.schoolGirl.name + " 给你娃娃");
    }

    @Override
    public void giveFlower() {
        System.out.println(this.schoolGirl.name + " 给你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.schoolGirl.name + " 给你巧克力");
    }
}
