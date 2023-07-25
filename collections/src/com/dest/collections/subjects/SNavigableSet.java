package com.dest.collections.subjects;

import java.util.*;

public class SNavigableSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Dest", "Delta", "Reicader", "Yuki"));
        NavigableSet<String> reverse = names.descendingSet();
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    }
}
