package com.github.dhirabayashi.designpattern.visitor;

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
        rootDir.accept(new ListVisitor());

        System.out.println();

        System.out.println("Making user entries...");
        var yuki = new Directory("yuki");
        var hanako = new Directory("hanako");
        var tomura = new Directory("tomura");
        usrDir.add(yuki);
        usrDir.add(hanako);
        usrDir.add(tomura);
        var diary = new File("diary.html", 100);
        yuki.add(diary);
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 300));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));
        rootDir.accept(new ListVisitor());

        var ffv = new FileFindVisitor(".html");
        rootDir.accept(ffv);

        System.out.println("HTML files are:");
        var it = ffv.getFoundFiles();
        while(it.hasNext()) {
            var file = it.next();
            System.out.println(file);
        }

        System.out.println("File size:");
        var sv = new SizeVisitor();
        rootDir.accept(sv);
        System.out.println(sv.getSize());

        System.out.println("ElementArrayList:");
        var list = new ElementArrayList();
        list.add(rootDir);
        list.add(new File("etc.html", 1234));

        list.accept(new ListVisitor());
    }
}
