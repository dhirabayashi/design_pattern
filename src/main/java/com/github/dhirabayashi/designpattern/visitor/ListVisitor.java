package com.github.dhirabayashi.designpattern.visitor;

public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        var it = directory.iterator();
        while (it.hasNext()) {
            var entry = it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
