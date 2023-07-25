package com.dest.collections.subjects;

import java.util.List;

public class SIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Daffa", "Dio", "Deo");
        for (var name : names) {
            System.out.println(name);
        }
    }
}
