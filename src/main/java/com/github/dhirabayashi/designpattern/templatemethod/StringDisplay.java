package com.github.dhirabayashi.designpattern.templatemethod;

import java.nio.charset.Charset;

public class StringDisplay extends Display {
    private final String str;
    private final int width;

    public StringDisplay(String str) {
        this.str = str;
        width = str.getBytes(Charset.forName("MS932")).length;
    }

    @Override
    void open() {
        printLine();
    }

    @Override
    void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    void close() {
        printLine();
    }

    private void printLine() {
        System.out.println("+" + "-".repeat(width) + "+");
    }
}
