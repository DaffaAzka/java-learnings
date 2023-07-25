package com.dest.collections.subjects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SList {

    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
        List<String> list = new ArrayList<>(100);
        list.add("Daffa");
        list.add("Islami");
        list.add("Azka");
        list.remove(1);
        System.out.println(list.toString());
    }

}
