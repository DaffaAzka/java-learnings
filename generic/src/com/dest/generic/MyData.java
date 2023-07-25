package com.dest.generic;

public class MyData<T> {
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(MyData<? super String> data) {
//        this.data = data;
    }
}
