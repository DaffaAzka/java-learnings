package com.dest.collections.subjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dest");
        list.add("Reicader");
        list.add("Delta");
        list.add("Badvibes");

        Collections.sort(list);
        for (var value : list) {
            System.out.println(value);
        }
    }
}
