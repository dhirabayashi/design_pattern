package com.github.dhirabayashi.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ElementArrayList implements Element {
    private final List<Entry> list = new ArrayList<>();

    public void add(Entry entry) {
        list.add(entry);
    }

    @Override
    public void accept(Visitor v) {
        for(var entry : list) {
            entry.accept(v);
        }
    }
}
