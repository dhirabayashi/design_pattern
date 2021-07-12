package com.github.dhirabayashi.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        var instance1 = Singleton.getInstance();
        var instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("End.");
    }
}
