package org.example.prototype.dto;

import org.example.prototype.sharp.Circle;
import org.example.prototype.sharp.Rectangle;
import org.example.prototype.sharp.Sharp;
import org.example.prototype.sharp.Square;

import java.util.Hashtable;

public class SharpCache {

    private static final Hashtable<String, Sharp> sharpMap = new Hashtable<>();

    public static Sharp getSharp(String sharpId) {
        Sharp sharp = sharpMap.get(sharpId);
        return (Sharp)sharp.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        sharpMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        sharpMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        sharpMap.put(rectangle.getId(), rectangle);
    }

}
