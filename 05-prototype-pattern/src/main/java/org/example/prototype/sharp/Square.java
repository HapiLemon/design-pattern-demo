package org.example.prototype.sharp;

public class Square extends Sharp {
    @Override
    public void draw() {
        System.out.println("this is Square");
    }

    public Square() {
        type = "Square";
    }
}
