package org.example.colleague;

import org.example.mediator.UnitedNation;

/**
 * @author keminfeng
 * @date 2022-03-22 10:22
 */
public class USA extends Country {

    public USA(UnitedNation mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        this.mediator.declare(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("USA receive message: " + message);
    }

}
