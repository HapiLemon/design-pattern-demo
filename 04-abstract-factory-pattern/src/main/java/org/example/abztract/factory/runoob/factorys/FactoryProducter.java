package org.example.abztract.factory.runoob.factorys;

public class FactoryProducter {
    public static AbstractFacotry getFactory(String factory) {
        if (factory == null) {
            return null;
        }
        if (factory.equalsIgnoreCase("sharp")) {
            return new SharpFactory();
        } else if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
