package com.dest.collections.subjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SBinarySearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        var value = Collections.binarySearch(list, 40);
        System.out.println(value);
    }

}
