package com.github.dhirabayashi.designpattern.composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        var rootDir = new Directory("root");
        var binDir = new Directory("bin");
        var tmpDir = new Directory("tmp");
        var usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.printList();

        System.out.println();

        System.out.println("Making user entries...");
        var yuki = new Directory("yuki");
        var hanako = new Directory("hanako");
        var tomura = new Directory("tomura");
        usrDir.add(yuki);
        usrDir.add(hanako);
        usrDir.add(tomura);
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 300));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));
        rootDir.printList();
    }
}
