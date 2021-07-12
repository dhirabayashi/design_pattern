package com.github.dhirabayashi.designpattern.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("インスタンスが生成されました。");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
