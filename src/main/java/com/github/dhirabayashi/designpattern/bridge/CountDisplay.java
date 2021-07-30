package com.github.dhirabayashi.designpattern.bridge;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int count) {
        open();
        for(int i = 0; i < count; i++) {
            print();
        }
        close();
    }
}
