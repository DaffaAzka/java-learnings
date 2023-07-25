package com.dest.collections.subjects;

import com.dest.collections.subjects.data.Person;
import com.dest.collections.subjects.data.PersonComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SCompare {
    public static void main(String[] args) {
        Set<Person> data = new TreeSet<>(new PersonComparator());
        data.add(new Person("Dest"));
        data.add(new Person("Reicader"));
        data.add(new Person("Yuki"));
        data.add(new Person("Delta"));
        data.add(new Person("Mid"));
        System.out.println(data.toString());
    }
}
