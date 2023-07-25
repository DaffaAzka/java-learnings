package com.dest.collections.subjects;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(10);
        deque.offerFirst("Dest");
        deque.offerFirst("Reicader");
        deque.offerFirst("Delta");
        deque.offerFirst("Badvibes");

        for (String next = deque.pollLast(); next != null; next = deque.pollLast()) {
            System.out.println(next);
        }
    }
}
