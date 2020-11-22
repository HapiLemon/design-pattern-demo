package org.example.abztract.factory.runoob.factorys;

import org.example.abztract.factory.runoob.color.Color;
import org.example.abztract.factory.runoob.sharp.Circle;
import org.example.abztract.factory.runoob.sharp.Rectangle;
import org.example.abztract.factory.runoob.sharp.Sharp;
import org.example.abztract.factory.runoob.sharp.Square;

public class SharpFactory extends AbstractFacotry{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Sharp getSharp(String sharp) {
        if (sharp == null) {
            return null;
        }

        if (sharp.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (sharp.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (sharp.equalsIgnoreCase("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
