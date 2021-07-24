package com.github.dhirabayashi.designpattern.builder;

// 余分なカンマが付く点において正しいJSONを生成しないが、練習なのでよいこととする（正しくしたければライブラリを使う）
public class JSONBuilder extends Builder {
    private final StringBuilder builder = new StringBuilder();

    @Override
    protected void buildTitle(String title) {
        builder.append("{").append("\n");
        builder.append("\t").append("\"title\": \"").append(title).append("\"").append(",\n");
        builder.append("\t").append("\"contents\": [").append("\n");
    }

    @Override
    protected void buildString(String str) {
        builder.append("\t").append("\t").append("{").append("\n");
        builder.append("\t").append("\t").append("\t").append("\"string\": \"").append(str).append("\"").append(",\n");
    }

    @Override
    protected void buildItems(String[] items) {
        builder.append("\t").append("\t").append("\t").append("\"items\": [").append("\n");
        for(var item : items) {
            builder.append("\t").append("\t").append("\t").append("\t").append("\"").append(item).append("\"").append(",\n");
        }
        builder.append("\t").append("\t").append("\t").append("],").append("\n");
        builder.append("\t").append("\t").append("},").append("\n");
    }

    @Override
    protected void abstractClose() {
        builder.append("\t").append("]").append(",\n");
        builder.append("}").append("\n");
    }

    public String getResult() {
        return builder.toString();
    }
}
