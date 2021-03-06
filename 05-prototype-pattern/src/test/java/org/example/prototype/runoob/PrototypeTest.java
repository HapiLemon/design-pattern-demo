package org.example.prototype.runoob;

import org.example.prototype.runoob.runoob.dto.SharpCache;
import org.example.prototype.runoob.runoob.sharp.Sharp;

public class PrototypeTest {
    public static void main(String[] args) {
        SharpCache.loadCache();

        Sharp sharp = SharpCache.getSharp("1");
        sharp.draw();

        Sharp sharp1 = SharpCache.getSharp("2");
        sharp1.draw();

        Sharp sharp2 = SharpCache.getSharp("3");
        sharp2.draw();
    }

}
