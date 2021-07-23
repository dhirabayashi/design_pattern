package com.github.dhirabayashi.designpattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    @Test
    void testMakeTitle() {
        var sut = new EmptyBuilder();
        assertDoesNotThrow(() -> sut.makeTitle(null));
        assertThrows(IllegalStateException.class, () -> sut.makeTitle(null));
    }

    @Test
    void testMakeString() {
        var sut = new EmptyBuilder();
        assertThrows(IllegalStateException.class, () -> sut.makeString(null));

        sut.makeTitle(null);
        assertDoesNotThrow(() -> sut.makeString(null));

        sut.close();
        assertThrows(IllegalStateException.class, () -> sut.makeString(null));
    }

    @Test
    void testTitles() {
        var sut = new EmptyBuilder();
        assertDoesNotThrow(() -> sut.makeTitle(null));
        assertThrows(IllegalStateException.class, () -> sut.makeTitle(null));

        sut.close();
        assertThrows(IllegalStateException.class, () -> sut.makeTitle(null));
    }

    @Test
    void testClose() {
        var sut = new EmptyBuilder();
        assertThrows(IllegalStateException.class, sut::close);

        sut.makeTitle(null);
        assertDoesNotThrow(sut::close);

        assertThrows(IllegalStateException.class, sut::close);
    }
}

class EmptyBuilder extends Builder {

    @Override
    protected void buildTitle(String title) {
    }

    @Override
    protected void buildString(String str) {
    }

    @Override
    protected void buildItems(String[] items) {
    }

    @Override
    protected void abstractClose() {
    }
}