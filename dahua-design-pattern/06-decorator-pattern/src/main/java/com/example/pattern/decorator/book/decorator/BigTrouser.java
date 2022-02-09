package com.example.pattern.decorator.book.decorator;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-08 14:01
 */
public class BigTrouser extends Finery {

    public BigTrouser(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public String show() {
        return super.show() + " 穿了一条垮裤";
    }

    @Override
    public Integer getFineryCount() {
        return super.getFineryCount() + 1;
    }
}
