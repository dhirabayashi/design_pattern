package com.github.dhirabayashi.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private final String name;
    private final List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        var size = 0;
        for(var entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for(var entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
