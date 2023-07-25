package com.dest.collections.subjects;

import com.dest.collections.subjects.data.Person;

import java.util.ArrayList;
import java.util.List;

public class SImmutableList {
    public static void main(String[] args) {
        var person = new Person("Dest");
        person.addHobbies("Coding");
        person.addHobbies("Gaming");
    }

    public static void doSomething(List<String> h) {
        h.add("bukan");
    }
}
