package com.example.pattern.decorator.book.decorator;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-09 15:34
 */
public class Jeans extends Finery {

    public Jeans(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public String show() {
        return super.show() + " 穿了一条牛仔裤";
    }

    @Override
    public Integer getFineryCount() {
        return super.getFineryCount() + 1;
    }
}
