package org.example.colleague;

import org.example.mediator.UnitedNation;

/**
 * @author keminfeng
 * @date 2022-03-22 10:20
 */
public abstract class Country {

    protected UnitedNation mediator;

    public Country(UnitedNation mediator) {
        this.mediator = mediator;
    }

    abstract void declare(String message);

    public abstract void getMessage(String message);
}
