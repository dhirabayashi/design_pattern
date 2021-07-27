package com.github.dhirabayashi.designpattern.abstractfactory.listfactory;

import com.github.dhirabayashi.designpattern.abstractfactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        var builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n");
        builder.append("<ul>\n");
        for (var item : tray) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
