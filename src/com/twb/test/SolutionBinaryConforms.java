package com.twb.test;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionBinaryConforms {
    public int solution(int A, int B, int C) {

        List<Integer> integers = Arrays.asList(A, B, C).stream().distinct().sorted().collect(Collectors.toList());

//        integers.stream().map( val -> {
//            char[] binChar = Integer.toBinaryString(val).toCharArray();
//            return binChar;
//        });
        Set<String> confSet = new HashSet<>();
        for(int val : integers ){
            String st = Integer.toBinaryString(val);
            confSet.add(st);
            char[] binChar = st.toCharArray();
            System.out.println("\ncur val: "+ val+"\t Bianry: "+ Arrays.toString(binChar));
            int firstIndex = st.indexOf('0');
            int lastIndex = st.lastIndexOf('0');
            String subSt = st.substring(firstIndex, lastIndex+1);
//            List<String> subList = generate(subSt);
//            int n = lastIndex - firstIndex +1;
            int n = subSt.length();
            System.out.println("Substring of: "+ st + " is :"+subSt + "\t n: "+n);
            int[] arr = new int[n];
            List<String> listGen = new ArrayList<>();
            // Print all binary strings
            generateAllBinaryStrings(listGen, n, arr, 0, subSt.toCharArray());

            String startSt = st.substring(0, firstIndex);
            String lastSt = st.substring(lastIndex+1);
            confSet.addAll(listGen.stream().map(it -> startSt + it + lastSt).collect(Collectors.toSet()));
        }

        System.out.println("Result: "+ confSet.stream().sorted().collect(Collectors.toList()));
        return confSet.size();
    }

    // Function to generate all binary strings
    private void generateAllBinaryStrings(List<String> list, int n,
                                          int arr[], int i, char[] binChar)
    {
        if (i == n) {
            String st = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining());
            if(st.length() != binChar.length) System.out.println("String generate: "+st);
            if(checkMatch(binChar, st.toCharArray()))
                list.add(st);
            return;
        }

        // First assign "0" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = 0;
        generateAllBinaryStrings(list, n, arr, i + 1, binChar);

        // And then assign "1" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = 1;
        generateAllBinaryStrings(list, n, arr, i + 1, binChar);
    }

    private boolean checkMatch(char[] A, char[] B) {
        boolean match = true;
        for(int i=0; i<A.length; i++){
            if(A[i]== '1' && B[i]=='0'){
                match = false;
                break;
            }
        }
        return match;
    }

    //        System.out.println("\nNumber of Integers conforming: "+sol.solution(1073741727, 1073741632, 1073741679));

}
