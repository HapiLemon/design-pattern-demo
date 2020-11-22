package org.example.simple.factory;

public abstract class Sharp {
    abstract void draw();

    /**
     * 简化简单工厂 将Sharp接口改为抽象类
     * 在抽象类内部写getSharp方法
     * @param sharpType
     * @return
     */
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
