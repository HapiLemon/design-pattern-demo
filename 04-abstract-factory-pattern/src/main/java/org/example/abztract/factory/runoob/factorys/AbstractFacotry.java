package org.example.abztract.factory.runoob.factorys;

import org.example.abztract.factory.runoob.color.Color;
import org.example.abztract.factory.runoob.sharp.Sharp;

public abstract class AbstractFacotry {
    public abstract Color getColor(String color);

    public abstract Sharp getSharp(String sharp);
}
