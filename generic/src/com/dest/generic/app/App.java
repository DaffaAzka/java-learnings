package com.dest.app;

import com.dest.generic.MyData;

public class App {
    public static void main(String[] args) {
        var stringData = new MyData<String>("Dest");
        var integerData = new MyData<Integer>(1000);

        System.out.println(stringData.getData());
        System.out.println(integerData.getData());
    }
}
