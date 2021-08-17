package com.github.dhirabayashi.designpattern.chainofresponsibility;

public class SpecialSupport extends Support {
    private final int number;

    protected SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
