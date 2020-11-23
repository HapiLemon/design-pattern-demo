package org.example.prototype.sharp;

public class Rectangle extends Sharp {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("this is Rectangle");
    }
}
