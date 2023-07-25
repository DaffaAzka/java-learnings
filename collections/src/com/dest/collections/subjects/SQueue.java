package com.dest.collections.subjects;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class SQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);
        queue.add("Dest");
        queue.add("Reicader");
        queue.add("Delta");
        queue.add("Badvibes");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
