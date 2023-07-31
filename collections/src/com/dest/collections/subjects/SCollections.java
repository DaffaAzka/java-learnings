package com.dest.collections.subjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dest");
        list.add("Reicader");
        list.add("Delta");
        list.add("Badvibes");

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
