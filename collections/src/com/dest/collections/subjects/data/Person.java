package com.dest.collections.subjects.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    String name;
    List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void addHobbies(String s) {
        this.hobbies.add(s);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
