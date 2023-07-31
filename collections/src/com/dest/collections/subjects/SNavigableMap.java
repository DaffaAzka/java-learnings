package com.dest.collections.subjects;

import com.dest.collections.subjects.data.Person;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("first", "Daffa");
        map.put("middle", "Islami");
        map.put("Last", "Azka");

        NavigableMap<String, String> descending = map.descendingMap();

        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(descending);

        for (var key : immutable.keySet()) {
            System.out.println(map.get(key));
        }

    }
}
