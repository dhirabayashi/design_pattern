package com.github.dhirabayashi.designpattern.templatemethod;

public class CharDisplay extends Display {
    private final char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(aChar);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
