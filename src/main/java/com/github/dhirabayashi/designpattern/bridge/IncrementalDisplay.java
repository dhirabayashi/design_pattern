package com.github.dhirabayashi.designpattern.bridge;

public class IncrementalDisplay extends CountDisplay {
    public IncrementalDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void incrementalDisplay(int count) {
        for(int i = 0; i < count; i++) {
            multiDisplay(i);
        }
    }
}
