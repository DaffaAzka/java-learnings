package com.dest.collections.subjects;

import java.util.LinkedHashMap;
import java.util.Map;

public class SLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("first", "Daffa");
        map.put("middle", "Islami");
        map.put("last", "Azka");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
