package com.github.dhirabayashi.designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;

public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch(IOException e) {
            throw new UncheckedIOException(e);
        }
        writer.println("<html><head><title>" + title +"</title></head><body>");
        //タイトルを出力
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void buildString(String str) {
        writer.println("<p>" + str +"</p>");
    }

    @Override
    public void buildItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void abstractClose() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}