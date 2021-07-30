package com.github.dhirabayashi.designpattern.bridge;

import java.nio.charset.Charset;

public class StringDisplayImpl implements DisplayImpl {
    private final String str;
    private final int width;

    public StringDisplayImpl(String str) {
        this.str = str;
        width = str.getBytes(Charset.forName("Windows-31J")).length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.print("|");
        System.out.print(str);
        System.out.println("|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
