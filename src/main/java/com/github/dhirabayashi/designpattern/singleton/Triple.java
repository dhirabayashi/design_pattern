package com.github.dhirabayashi.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

public final class Triple {
    private static final Map<Integer, Triple> pool = new HashMap<>(3);

    private Triple() {}

    static {
        for(int i = 0; i < 3; i++) {
            pool.put(i, new Triple());
        }
    }

    public static Triple getInstance(int id) {
        return pool.get(id);
    }
}
