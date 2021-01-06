package org.example.pattern.bridge.book;

import org.example.pattern.bridge.book.images.Implementor.ImageImp;
import org.example.pattern.bridge.book.images.abstraction.Image;
import org.example.pattern.bridge.book.utils.XMLUtil;

public class BookBridgePatternDemo {
    public static void main(String args[]) {
        Image image;
        ImageImp imp;
        image = (Image) XMLUtil.getBean("image");
        imp = (ImageImp)XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
