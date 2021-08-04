package com.github.dhirabayashi.designpattern.strategy.sort;

import java.util.Arrays;

public class StandardSorter implements Sorter {
    @Override
    public void sort(Comparable<?>[] data) {
        Arrays.sort(data);
    }
}
