package com.github.dhirabayashi.designpattern.adapter.list2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO f = new FileProperties();
        f.readFromFile("file.txt");
        System.out.println(f.getValue("year"));
        f.setValue("year", "2004");
        f.setValue("month", "4");
        f.setValue("day", "21");
        f.writeToFile("newfile.txt");
    }
}
