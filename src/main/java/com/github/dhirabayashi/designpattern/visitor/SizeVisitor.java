package com.github.dhirabayashi.designpattern.visitor;

public class SizeVisitor extends Visitor {
    private int size;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        var it = directory.iterator();
        while(it.hasNext()) {
            var entry = it.next();
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}
