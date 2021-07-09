package com.github.dhirabayashi.designpattern.factorymethod.idcard;

import com.github.dhirabayashi.designpattern.factorymethod.framework.Factory;
import com.github.dhirabayashi.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(product);
    }
}
