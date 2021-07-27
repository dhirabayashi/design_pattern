package com.github.dhirabayashi.designpattern.abstractfactory;

import com.github.dhirabayashi.designpattern.abstractfactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        var factory = Factory.getFactory("com.github.dhirabayashi.designpattern.abstractfactory.listfactory.ListFactory");

        var yomiuri = factory.createLink("読売新聞", "https://www.yomiuri.co.jp/");
        var sankei = factory.createLink("産経新聞", "https://www.sankei.com/");

        var google = factory.createLink("Google", "https://www.google.com/");
        var yahoo = factory.createLink("Yahoo!", "https://www.yahoo.co.jp/");

        var news = factory.createTray("新聞");
        news.add(yomiuri);
        news.add(sankei);

        var search = factory.createTray("検索エンジン");
        search.add(google);
        search.add(yahoo);

        var page = factory.createPage("LinkPage", "dhirabayashi");
        page.add(news);
        page.add(search);
        page.output();
    }
}
