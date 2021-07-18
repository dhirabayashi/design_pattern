package com.github.dhirabayashi.designpattern.prototype;

import java.nio.charset.Charset;

public class MessageBox extends AbstractProduct {
    private final char aChar;

    public MessageBox(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void use(String s) {
        var width = s.getBytes(Charset.forName("Windows-31J")).length + 4;
        printLine(width);
        System.out.println(aChar + " " + s + " " + aChar);
        printLine(width);
    }

    private void printLine(int width) {
        for(int i = 0; i < width; i++) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
