package com.aleksey.structural.fly_weight;

import java.util.HashMap;
import java.util.Map;

public class TreeFlyWeightFactory {
    private static final Map<String, TreeType> map = new HashMap<>();

    public TreeType getTreeType(String name, String color) {
        TreeType type = map.get(name);
        if(type == null) {
            type = new TreeType(name, color);
            map.put(name, type);
        }
        return type;
    }
}
