package com.github.dhirabayashi.designpattern.chainofresponsibility;

public class LimitSupport extends Support {
    private final int limit;

    protected LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
