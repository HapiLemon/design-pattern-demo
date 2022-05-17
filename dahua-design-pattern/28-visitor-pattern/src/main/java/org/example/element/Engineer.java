package org.example.element;

import org.example.visitor.Employer;

import java.util.Random;

/**
 * @author keminfeng
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name, new Random().nextInt(10));
    }

    @Override
    public void accept(Employer employer) {
        employer.visit(this);
    }

    public int getCodeLine() {
        return new Random().nextInt(10 * 10000);
    }
}
