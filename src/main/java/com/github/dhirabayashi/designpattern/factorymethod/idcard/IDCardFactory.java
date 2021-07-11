package com.github.dhirabayashi.designpattern.factorymethod.idcard;

import com.github.dhirabayashi.designpattern.factorymethod.framework.Factory;
import com.github.dhirabayashi.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private final List<Product> owners = new ArrayList<>();
    private int id = 0;

    private final Map<Integer, String> map = new HashMap<>();

    @Override
    protected Product createProduct(String owner) {
        id++;
        map.put(id, owner);

        return new IDCard(owner, id);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(product);
    }

    public List<Product> getOwners() {
        return new ArrayList<>(owners);
    }

    public Map<Integer, String> getMap() {
        return new HashMap<>(map);
    }
}
