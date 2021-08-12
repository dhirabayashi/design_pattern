package com.github.dhirabayashi.designpattern.visitor;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public Iterator<Entry> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
