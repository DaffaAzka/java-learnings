package com.dest.collections.subjects;

import com.dest.collections.subjects.data.Person;
import com.dest.collections.subjects.data.PersonComparator;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SSortedMap {
    public static void main(String[] args) {
        PersonComparator comparator = new PersonComparator();
        SortedMap<Person, String> map = new TreeMap<>(comparator);

        map.put(new Person("first"), "Daffa");
        map.put(new Person("middle"), "Islami");
        map.put(new Person("Last"), "Azka");

        var immutable = Collections.unmodifiableSortedMap(map);

        for (var key : immutable.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
