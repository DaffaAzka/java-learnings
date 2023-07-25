package com.dest.generic.app;

import com.dest.generic.ArrayHelper;
import com.dest.generic.MyData;
import com.dest.generic.NumberData;
import com.dest.generic.Pair;

public class App {
    public static void main(String[] args) {
//        var stringData = new MyData<String>("Dest");
//        var integerData = new MyData<Integer>(1000);
//
//        System.out.println(stringData.getData());
//        System.out.println(integerData.getData());

//        var pair = new Pair<String, Integer>("Dest", 14);

        String[] names = {"Daffa", "Islami", "Azka"};
        Integer[] numbers = {1, 4, 5, 7, 8};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.<Integer>count(numbers));

        NumberData<Integer> data = new NumberData<>(10);
    }
}
