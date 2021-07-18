package com.github.dhirabayashi.designpattern.prototype;

import java.nio.charset.Charset;

public class UnderlinePen extends AbstractProduct {
    private final char aChar;

    public UnderlinePen(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void use(String s) {
        System.out.println("\"" + s + "\"");
        var width = s.getBytes(Charset.forName("Windows-31J")).length;

        System.out.print(' ');
        for(int i = 0; i < width; i++) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
