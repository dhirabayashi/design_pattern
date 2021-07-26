package com.github.dhirabayashi.designpattern.abstractfactory.factory;

public abstract class Item {
    protected final String caption;

    protected Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
