package com.github.dhirabayashi.designpattern.templatemethod;

public class CharDisplay extends Display {
    private final char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(aChar);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }
}
