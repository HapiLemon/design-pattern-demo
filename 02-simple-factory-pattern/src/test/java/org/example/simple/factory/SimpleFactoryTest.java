package org.example.simple.factory;

import java.util.Arrays;
import java.util.List;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SharpFactory sharpFactory=new SharpFactory();

        List<String> sharp = Arrays.asList("circle","square","rectangle");
        for (String s : sharp) {
            sharpFactory.getSharp(s).draw();
        }
    }
}
