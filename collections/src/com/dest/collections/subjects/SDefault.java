package com.dest.collections.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SDefault {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dest");
        list.add("Reicader");
        list.add("Delta");
        list.add("Badvibes");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
