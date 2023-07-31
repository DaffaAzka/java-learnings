package com.dest.collections.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SSplitrator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dest");
        list.add("Reicader");
        list.add("Delta");
        list.add("Badvibes");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        spliterator2.forEachRemaining((s) -> {
            System.out.println(s);
        });
    }
}
