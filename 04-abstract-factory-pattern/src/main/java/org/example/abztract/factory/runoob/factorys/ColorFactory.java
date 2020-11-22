package org.example.abztract.factory.runoob.factorys;

import org.example.abztract.factory.runoob.color.Blue;
import org.example.abztract.factory.runoob.color.Color;
import org.example.abztract.factory.runoob.color.Green;
import org.example.abztract.factory.runoob.color.Red;
import org.example.abztract.factory.runoob.sharp.Sharp;

public class ColorFactory extends AbstractFacotry{
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        } else {
            return null;
        }
    }

    @Override
    public Sharp getSharp(String sharp) {
        return null;
    }
}
