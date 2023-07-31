package com.dest.collections.subjects;

import java.util.WeakHashMap;

public class SWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<Integer, Integer> map = new WeakHashMap<>();

        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }

        System.gc();
        System.out.println(map.size());
    }
}
