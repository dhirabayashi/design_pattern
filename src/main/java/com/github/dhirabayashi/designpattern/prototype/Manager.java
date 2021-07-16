package com.github.dhirabayashi.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    Map<String, Product> map = new HashMap<>();

    public void register(String key, Product product) {
        map.put(key, product);
    }

    public Product create(String key) {
        return map.get(key).createClone();
    }
}
