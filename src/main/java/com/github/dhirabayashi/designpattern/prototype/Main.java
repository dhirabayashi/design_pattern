package com.github.dhirabayashi.designpattern.prototype;

public class Main {
    public static void main(String[] args) {
        var manager = new Manager();
        var mbox = new MessageBox('*');
        var sbox = new MessageBox('/');
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        var p1 = manager.create("warning box");
        p1.use("Hello, world.");
        var p2 = manager.create("slash box");
        p2.use("Hello, world.");
    }
}
