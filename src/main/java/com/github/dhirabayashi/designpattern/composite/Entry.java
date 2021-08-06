package com.github.dhirabayashi.designpattern.composite;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
