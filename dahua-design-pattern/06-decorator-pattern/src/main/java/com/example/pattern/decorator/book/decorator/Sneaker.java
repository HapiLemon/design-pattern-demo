package com.example.pattern.decorator.book.decorator;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-08 18:27
 */
public class Sneaker extends Finery {

    public Sneaker(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public String show() {
        return super.show() + " 穿了一双运动鞋";
    }

    @Override
    public Integer getFineryCount() {
        return super.getFineryCount() + 1;
    }
}
