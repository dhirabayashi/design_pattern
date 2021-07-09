package com.github.dhirabayashi.designpattern.factorymethod.idcard;

import com.github.dhirabayashi.designpattern.factorymethod.framework.Product;

public class IDCard extends Product {
    private final String owner;

    public IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
