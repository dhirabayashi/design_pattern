package com.github.dhirabayashi.designpattern.decorator;

import java.nio.charset.Charset;

public class StringDisplay extends Display {
    private final String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes(Charset.forName("Windows-31J")).length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
