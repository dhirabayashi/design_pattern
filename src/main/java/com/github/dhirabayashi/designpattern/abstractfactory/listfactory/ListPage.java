package com.github.dhirabayashi.designpattern.abstractfactory.listfactory;

import com.github.dhirabayashi.designpattern.abstractfactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        var builder = new StringBuilder();
        builder.append("<html><head><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
        builder.append("<ul>");
        for(var item : content) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>");
        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
