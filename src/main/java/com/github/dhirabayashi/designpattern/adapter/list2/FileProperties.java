package com.github.dhirabayashi.designpattern.adapter.list2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    private final Properties properties = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        properties.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        properties.store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String  getValue(String key) {
        return properties.getProperty(key);
    }
}
