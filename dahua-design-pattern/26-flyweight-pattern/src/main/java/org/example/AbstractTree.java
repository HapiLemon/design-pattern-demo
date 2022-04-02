package org.example;

import lombok.Data;

/**
 * @author keminfeng
 */
@Data
public abstract class AbstractTree {

    private int x;

    private int y;

    protected void showPosition() {
        System.out.printf(" was planted at (%d,%d)%n", x, y);
    }
    
    abstract void displayTreePosition();
}
