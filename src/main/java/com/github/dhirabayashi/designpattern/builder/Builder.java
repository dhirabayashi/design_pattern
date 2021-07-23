package com.github.dhirabayashi.designpattern.builder;

public abstract class Builder {
    private boolean initialized;
    private boolean closed;

    public void makeTitle(String title) {
        if(initialized) {
            throw new IllegalStateException("makeTitle()は一度しか呼べません。");
        }
        buildTitle(title);
        initialized = true;
    }

    public void makeString(String str) {
        checkInitialized();
        checkClosed();
        buildString(str);
    }

    public void makeItems(String[] items) {
        checkInitialized();
        checkClosed();
        buildItems(items);
    }

    public void close() {
        checkInitialized();
        checkClosed();

        abstractClose();
        closed = true;
    }

    private void checkInitialized() {
        if(!initialized) {
            throw new IllegalStateException("まずmakeTitle()を呼び出してください。");
        }
    }

    private void checkClosed() {
        if(closed) {
            throw new IllegalStateException("既にcloseされています。");
        }
    }

    protected abstract void buildTitle(String title);
    protected abstract void buildString(String str);
    protected abstract void buildItems(String[] items);
    protected abstract void abstractClose();
}
