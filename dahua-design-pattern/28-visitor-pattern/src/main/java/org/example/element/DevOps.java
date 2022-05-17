package org.example.element;

import org.example.visitor.Employer;

import java.util.Random;

/**
 * @author keminfeng
 */
public class DevOps extends Staff {
    public DevOps(String name) {
        super(name, new Random().nextInt(10));
    }

    @Override
    public void accept(Employer employer) {
        employer.visit(this);
    }

    public int getServerQuantity() {
        return new Random().nextInt(10);
    }
}
