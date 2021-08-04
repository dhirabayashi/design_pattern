package com.github.dhirabayashi.designpattern.strategy.sort;

import java.util.Arrays;

public class SortAndPrint {
    private final Comparable<?>[] data;
    private final Sorter sorter;

    public SortAndPrint(Comparable<?>[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    private void print() {
        System.out.println(Arrays.toString(data));
    }
}
