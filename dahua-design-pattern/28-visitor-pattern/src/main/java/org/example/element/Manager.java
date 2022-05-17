package org.example.element;

import org.example.visitor.Employer;

import java.util.Random;

/**
 * @author keminfeng
 */
public class Manager extends Staff {

    public Manager(String name) {
        super(name, new Random().nextInt(10));
    }

    @Override
    public void accept(Employer employer) {
        employer.visit(this);
    }

    public int getProductQuantity() {
        return new Random().nextInt(10);
    }
}
