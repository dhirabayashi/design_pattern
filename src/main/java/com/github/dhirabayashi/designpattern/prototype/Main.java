package com.github.dhirabayashi.designpattern.prototype;

public class Main {
    public static void main(String[] args) {
        var manager = new Manager();
        var mbox = new MessageBox('*');
        var sbox = new MessageBox('/');
        var upen = new UnderlinePen('~');
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        manager.register("strong message", upen);

        var p1 = manager.create("warning box");
        p1.use("Hello, world.");
        var p2 = manager.create("slash box");
        p2.use("Hello, world.");
        var p3 = manager.create("strong message");
        p3.use("Hello, world.");
    }
}
