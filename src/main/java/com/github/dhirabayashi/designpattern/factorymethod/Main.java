package com.github.dhirabayashi.designpattern.factorymethod;

import com.github.dhirabayashi.designpattern.factorymethod.framework.Factory;
import com.github.dhirabayashi.designpattern.factorymethod.framework.Product;
import com.github.dhirabayashi.designpattern.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Mario");
        Product card2 = factory.create("Luigi");
        card1.use();
        card2.use();

        System.out.println(factory.getOwners());
    }
}
