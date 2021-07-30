package com.github.dhirabayashi.designpattern.bridge;

public class Main {
    public static void main(String[] args) {
        var d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        var d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        var d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
