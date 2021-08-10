package com.github.dhirabayashi.designpattern.decorator;

public class UpDownBorder extends Border {
    private final char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == display.getRows() + 1) {
            return String.valueOf(ch).repeat(display.getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }
}
