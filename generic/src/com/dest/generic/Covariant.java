package com.dest.generic;

import java.util.Objects;

public class Covariant {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Dest");
        doIt(data);
    }

    static void doIt(MyData<? extends Object> data) {
        Object o = data.getData();
    }
}
