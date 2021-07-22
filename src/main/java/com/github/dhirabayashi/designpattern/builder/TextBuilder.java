package com.github.dhirabayashi.designpattern.builder;

public class TextBuilder extends Builder {
    private final StringBuilder builder = new StringBuilder();

    @Override
    protected void buildTitle(String title) {
        builder.append("====================\n");
        builder.append("『").append(title).append("』");
        builder.append("\n");
    }

    @Override
    protected void buildString(String str) {
        builder.append("■").append(str).append("\n");
        builder.append("\n");
    }

    @Override
    protected void buildItems(String[] items) {
        for (String item : items) {
            builder.append("   ・").append(item).append("\n");
        }
        builder.append("\n");
    }

    @Override
    public void abstractClose() {
        builder.append("====================\n");
    }

    public String getResult() {
        return builder.toString();
    }
}