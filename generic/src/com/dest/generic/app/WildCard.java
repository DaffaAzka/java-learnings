package com.dest.generic.app;

import com.dest.generic.MyData;

public class WildCard {
    public static void main(String[] args) {

    }

    void printLength(MyData<?> data) {
        System.out.println(data.getData());
    }
}
