package com.github.dhirabayashi.designpattern.abstractfactory.listfactory;

import com.github.dhirabayashi.designpattern.abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}