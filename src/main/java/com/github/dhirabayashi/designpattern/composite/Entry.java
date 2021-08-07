package com.github.dhirabayashi.designpattern.composite;

public abstract class Entry {
    protected Entry parent;
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String getFullName() {
        var fullName = new StringBuilder();
        var entry = this;
        do {
            fullName.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while(entry != null);
        return fullName.toString();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
