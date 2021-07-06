package com.github.dhirabayashi.designpattern.templatemethod;

public class Main {
    public static void main(String[] args) {
        Display d1 = new CharDisplay('H');
        d1.display();

        Display d2 = new StringDisplay("Hello, world.");
        d2.display();

        Display d3 = new StringDisplay("こんにちは。");
        d3.display();
    }
}
