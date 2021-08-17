package com.github.dhirabayashi.designpattern.chainofresponsibility;

public class OddSupport extends Support {
    protected OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
