package org.example.prototype.sharp;

public class Circle extends Sharp{
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }

    public Circle() {
        type = "Circle";
    }
}
