package com.github.dhirabayashi.designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;

public class HTMLBuilder implements Builder {
    private String filename;
    private PrintWriter writer;

    public void makeTitle(String title) {
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
    public void makeString(String str) {
        writer.println("<p>" + str +"</p>");
    }
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }
    public String getResult() {
        return filename;
    }
}