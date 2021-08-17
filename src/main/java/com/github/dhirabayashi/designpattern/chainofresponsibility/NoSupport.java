package com.github.dhirabayashi.designpattern.chainofresponsibility;

public class NoSupport extends Support {
    protected NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
