package com.github.dhirabayashi.designpattern.facade;

import com.github.dhirabayashi.designpattern.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
        PageMaker.makeLinkPage("linkpage.html");
    }
}
