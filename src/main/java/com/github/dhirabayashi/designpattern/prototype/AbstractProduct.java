package com.github.dhirabayashi.designpattern.prototype;

public abstract class AbstractProduct implements Product {
    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
