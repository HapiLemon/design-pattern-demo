package com.example.pattern.decorator.book.decorator;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-08 11:44
 */
public class TShirt extends Finery {

    public TShirt(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public String show() {
        return super.show() + " 穿了一件T恤";
    }

    @Override
    public Integer getFineryCount() {
        return super.getFineryCount() + 1;
    }
}
