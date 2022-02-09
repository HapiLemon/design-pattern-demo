package com.example.pattern.decorator.book.decorator;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-09 10:58
 */
public class Finery extends AbstractPerson {

    private final AbstractPerson abstractPerson;

    public Finery(AbstractPerson abstractPerson) {
        this.abstractPerson = abstractPerson;
    }

    @Override
    public String show() {
        return this.abstractPerson.show();
    }

    @Override
    public Integer getFineryCount() {
        return this.abstractPerson.getFineryCount();
    }
}
