package com.github.dhirabayashi.designpattern.decorator;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private final List<String> lines = new ArrayList<>();
    private int maxWidth;

    @Override
    public int getColumns() {
        return maxWidth;
    }

    @Override
    public int getRows() {
        return lines.size();
    }

    @Override
    public String getRowText(int row) {
        var str = lines.get(row);
        var padding = maxWidth - getWidth(str);

        if(padding != 0) {
            return String.format("%-" + (str.length() + padding) + "s", str);
        } else {
            return str;
        }
    }

    public void add(String line) {
        var width = getWidth(line);
        if(width > maxWidth) {
            maxWidth = width;
        }
        lines.add(line);
    }

    private int getWidth(String str) {
        return str.getBytes(Charset.forName("Windows-31J")).length;
    }
}
