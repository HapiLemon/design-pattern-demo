package org.example.prototype.runoob.runoob.dto;

import org.example.prototype.runoob.runoob.sharp.Circle;
import org.example.prototype.runoob.runoob.sharp.Rectangle;
import org.example.prototype.runoob.runoob.sharp.Sharp;
import org.example.prototype.runoob.runoob.sharp.Square;

import java.util.Hashtable;

/**
 * 原型管理器
 */
public class SharpCache {

    private static final Hashtable<String, Sharp> sharpMap = new Hashtable<>();

    /**
     * 为什么不直接返回而需要clone后返回
     * return sharpMap.get(sharpId);
     * 个人理解：
     * 需要返回的是一个新的内存空间中的一个对象
     * 而不是存入的原对象
     * 根据实际情况 选择深拷贝 浅拷贝
     *
     * @param sharpId
     * @return
     */
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
