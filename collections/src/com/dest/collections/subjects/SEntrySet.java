package com.dest.collections.subjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SEntrySet {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("first", "Daffa");
        map.put("Last", "Azka"); 
        map.put("middle", "Islami");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry :
                entries) {
            System.out.println("===");
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

    }
}
