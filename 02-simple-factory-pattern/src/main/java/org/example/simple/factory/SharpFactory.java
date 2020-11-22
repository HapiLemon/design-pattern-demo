package org.example.simple.factory;

/**
 * 由入参决定使用哪个接口
 */
public class SharpFactory {

    public Sharp getSharp(String sharpType) {
        if (sharpType == null) {
            return null;
        }

        if (sharpType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (sharpType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (sharpType.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
