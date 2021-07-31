package com.github.dhirabayashi.designpattern.bridge;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        var d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        var d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        var d4 = new RandomCountDisplay(new StringDisplayImpl("test"));
        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d3.multiDisplay(5);
        d4.randomDisplay(5);

        try(var impl = new FileDisplayImpl("settings.gradle")) {
            var fd = new CountDisplay(impl);
            fd.multiDisplay(3);
        }
    }
}
