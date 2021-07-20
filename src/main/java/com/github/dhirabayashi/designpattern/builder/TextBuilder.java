package com.github.dhirabayashi.designpattern.builder;

public class TextBuilder implements Builder {
    private final StringBuilder builder = new StringBuilder();
    public void makeTitle(String title) {
        builder.append("====================\n");
        builder.append("『").append(title).append("』");
        builder.append("\n");
    }

    public void makeString(String str) {
        builder.append("■").append(str).append("\n");
        builder.append("\n");
    }

    public void makeItems(String[] items) {
        for (String item : items) {
            builder.append("   ・").append(item).append("\n");
        }
        builder.append("\n");
    }
    public void close() {
        builder.append("====================\n");
    }
    public String getResult() {
        return builder.toString();
    }
}