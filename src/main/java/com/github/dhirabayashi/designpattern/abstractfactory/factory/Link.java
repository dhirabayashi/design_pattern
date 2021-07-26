package com.github.dhirabayashi.designpattern.abstractfactory.factory;

public abstract class Link extends Item {
    protected final String url;

    protected Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
