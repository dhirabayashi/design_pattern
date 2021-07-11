package com.github.dhirabayashi.designpattern.factorymethod.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
