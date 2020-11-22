package org.example.factory.method.factory;

import org.example.factory.method.product.Product;
import org.example.factory.method.product.ProductA;

public class FactoryA extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
