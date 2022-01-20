package com.twb.test;

import java.util.*;
import java.util.stream.Collectors;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> names = Arrays.asList(names1).stream().collect(Collectors.toSet());
        for(String s: names2){
            if(!names.contains(s)){
                names.add(s);
            }
        }
//        List<String> list = names.stream().sorted().toArray(String::new); //collect(Collectors.toList());
        String[] results = names.stream().sorted().toArray(String[]::new); //collect(Collectors.toList());
//        String[] results = new String[list.size()];
//        for(int i=0; i < list.size(); i++){
//            results[i] = list.get(i);
//        }
        return results;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Sophia", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        List<String> mergesList = new ArrayList<String>(Arrays.asList(names1));
        mergesList.addAll(Arrays.asList(names2));
        String[] merges = mergesList.stream().distinct().sorted().toArray(String[]::new);
        System.out.println("Merges streams: "+Arrays.toString(merges));
        System.out.println("Merges streams join : "+Arrays.stream(merges).collect(Collectors.joining(", ")));
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
