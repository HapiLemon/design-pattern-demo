package com.example.pattern.decorator.book.decorator;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-09 15:33
 */
public class Shirt extends Finery {

    public Shirt(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public String show() {
        return super.show() + " 穿了一件衬衫";
    }

    @Override
    public Integer getFineryCount() {
        return super.getFineryCount() + 1;
    }
}
