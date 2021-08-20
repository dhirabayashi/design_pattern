package com.github.dhirabayashi.designpattern.facade.pagemaker;

import java.io.IOException;
import java.util.Properties;

class Database {
    private Database() {}

    public static Properties getProperties(String dbname) {
        var filename = dbname + ".txt";
        var prop = new Properties();

        try {
            var classLoader = Database.class.getClassLoader();
            prop.load(classLoader.getResourceAsStream(filename));
        } catch (IOException e) {
            System.err.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
