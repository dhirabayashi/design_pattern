package com.github.dhirabayashi.designpattern.visitor;

public interface Element {
    void accept(Visitor v);
}
