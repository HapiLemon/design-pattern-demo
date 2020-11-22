package org.example.factory.method.factory;

import org.example.factory.method.product.Product;
import org.example.factory.method.product.ProductB;

public class FactoryB extends Factory{
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
