package com.dest.collections.subjects;

import java.util.IdentityHashMap;
import java.util.Map;

public class SIdentityHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "map.first";

        String mapName = "map";
        String first = "first";

        String key2 = mapName + "." + first;

        map.put(key1, "dest");
        map.put(key2, "dest");

        System.out.println(map.size());
    }
}
