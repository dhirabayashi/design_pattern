package com.github.dhirabayashi.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
    /**
     * 拡張子
     */
    private final String extension;

    /**
     * 条件に合致したファイルリスト
     */
    private final List<File> foundFiles = new ArrayList<>();

    public FileFindVisitor(String extension) {
        this.extension = extension;
    }

    @Override
    public void visit(File file) {
        if(file.getName().endsWith(extension)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        var it = directory.iterator();
        while(it.hasNext()) {
            var entry = it.next();
            entry.accept(this);
        }
    }

    public Iterator<File> getFoundFiles() {
        return foundFiles.iterator();
    }
}
