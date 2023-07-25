package com.dest.generic.app;

import com.dest.generic.Person;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Dest"),
                new Person("Delta"),
                new Person("Rei")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
