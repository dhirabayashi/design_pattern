package com.github.dhirabayashi.designpattern.strategy.sort;

public class Main {
    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        var sap = new SortAndPrint(data, new StandardSorter());
        sap.execute();
    }
}
