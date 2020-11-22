package org.example.factory.method;

import org.example.factory.method.factory.Factory;
import org.example.factory.method.utils.XMLUtil;

public class FactoryMethodTest {
    public static void main(String[] args) {

         Factory factory=(Factory)XMLUtil.getBean();
         factory.Manufacture().show();
    }
}
