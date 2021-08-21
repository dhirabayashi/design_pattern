package com.github.dhirabayashi.designpattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailAddress, String filename) {
        try(var writer = new HtmlWriter(new FileWriter(filename))) {
            var mailProp = Database.getProperties("maildata");
            var username = mailProp.getProperty(mailAddress);
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "のページへようこそ。");
            writer.paragraph("メールまっていますね。");
            writer.mailto(mailAddress, username);
            System.out.println(filename + " is created for " + mailAddress + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try(var writer = new HtmlWriter(new FileWriter(filename))) {
            var mailProp = Database.getProperties("maildata");
            writer.title("Link page");
            mailProp.forEach((mailAddress, username) -> {
                try {
                    writer.mailto((String)mailAddress, (String)username);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            });
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}