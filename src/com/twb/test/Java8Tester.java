package com.twb.test;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Tester {

    public static void main(String args[]) {

        List<String> names1 = new ArrayList<>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        List<String> names3 = new ArrayList<>();
        names3.add("Mahesh ");
        names3.add("Suresh ");
        names3.add("Ramesh ");
        names3.add("Naresh ");
        names3.add("Kalpesh ");

        Java8Tester tester = new Java8Tester();
        System.out.println("Sort using Java 7 syntax: ");

        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax: ");

        tester.sortUsingJava8(names2);
        System.out.println(names2);

        System.out.println("Sort using Java 8 2 syntax: ");

        names3 = names3.stream().sorted().collect(Collectors.toList());
        names3.forEach(System.out::println);
//        System.out.println(names3);

        String[] tabs = names1.stream().toArray(String[]::new);
        Arrays.stream(tabs).forEach(System.out::print);
        System.out.println("\n"+Arrays.toString(tabs));
    }

    //sort using java 7
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
