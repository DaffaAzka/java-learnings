package com.dest.collections.subjects;

import java.util.HashMap;

public class SHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("first", "Daffa");
        hashMap.put("middle", "Islami");
        hashMap.put("last", "Azka");

        System.out.println(hashMap.get("first"));
        System.out.println(hashMap.get("middle"));
        System.out.println(hashMap.get("last"));
    }
}
