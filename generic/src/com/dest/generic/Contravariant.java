package com.dest.generic;

public class Contravariant {
    public static void main(String[] args) {
        MyData<Object> data = new MyData<>("Dest");
        doIt(data);
    }

    static void doIt(MyData<? super String> data) {
        data.setData(data);
    }
}
