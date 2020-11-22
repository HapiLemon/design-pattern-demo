package org.example.abztract.factory.runoob;

import org.example.abztract.factory.runoob.color.Color;
import org.example.abztract.factory.runoob.factorys.AbstractFacotry;
import org.example.abztract.factory.runoob.factorys.FactoryProducter;
import org.example.abztract.factory.runoob.sharp.Sharp;

public class RuNoobAbstractFactoryTest {
    public static void main(String[] args) {
        sharpTest();
        colorTest();
    }

    public static void sharpTest() {
        AbstractFacotry sharpFactory = FactoryProducter.getFactory("sharp");

        Sharp circle = sharpFactory.getSharp("Circle");
        circle.draw();

        Sharp rectangle = sharpFactory.getSharp("Rectangle");
        rectangle.draw();

        Sharp square = sharpFactory.getSharp("Square");
        square.draw();
    }

    public static void colorTest() {
        AbstractFacotry colorFactory = FactoryProducter.getFactory("color");

        Color red = colorFactory.getColor("Red");
        red.fill();

        Color blue = colorFactory.getColor("Blue");
        blue.fill();

        Color green = colorFactory.getColor("Green");
        green.fill();
    }
}
