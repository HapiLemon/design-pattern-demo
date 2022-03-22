package org.example.colleague;

import org.example.mediator.UnitedNation;

/**
 * @author keminfeng
 * @date 2022-03-22 10:24
 */
public class Iraq extends Country {

    public Iraq(UnitedNation mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        this.mediator.declare(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Iraq receive message: " + message);
    }
}
