package com.dest.collections.subjects;

import java.util.HashSet;
import java.util.Set;

public class SHashSet {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Dest");
        names.add("Rei");
        names.add("Del");

        System.out.println(names.toString());
    }

}
