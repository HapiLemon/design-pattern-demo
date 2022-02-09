package com.example.pattern.decorator.book.concretecomponent;

import com.example.pattern.decorator.book.component.AbstractPerson;

/**
 * @author keminfeng
 * @date 2022-02-08 11:41
 */
public class Person extends AbstractPerson {

    private final String name;


    public Person(String name) {
        this.name = name;
    }

    @Override
    public String show() {
        return name;
    }

    @Override
    public Integer getFineryCount() {
        return 0;
    }
}
