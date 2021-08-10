package com.github.dhirabayashi.designpattern.decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world!");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        Display b4 = new UpDownBorder(b1, '/');
        b4.show();

        var md = new MultiStringDisplay();
        md.add("おはようございます。");
        md.add("こんにちは。");
        md.add("おやすみなさい、また明日。");
        md.show();
        Display b5 = new FullBorder(md);
        b5.show();
    }
}
