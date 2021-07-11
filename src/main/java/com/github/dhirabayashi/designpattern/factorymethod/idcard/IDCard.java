package com.github.dhirabayashi.designpattern.factorymethod.idcard;

import com.github.dhirabayashi.designpattern.factorymethod.framework.Product;

public class IDCard extends Product {
    private final String owner;
    private final int number;

    IDCard(String owner, int number) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
        this.number = number;
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
