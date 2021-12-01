package com.twb.test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[]args) {
//        Pattern p = Pattern.compile("\\{[a-z_A-Z]+\\}");
//        Matcher m = p.matcher("{civilite} {nom} your appointment on {date} for {listePrestations_heureDebut}, has been successfully registered. Thank you.");
//        while(m.find()) {
//            String val = m.group().substring(1);
//            System.out.println(val.substring(0, val.length()-1));
//        }

        int m=2;
        int sum = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(m)
                .map(t -> t[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Total Fibonacci : " + sum);
//                .boxed().collect(Collectors.toList());
        List<Integer> numbers = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(m)
                .map(n -> n[0])
                .collect(Collectors.toList());
        System.out.println("Total Fibonacci elt : " + numbers);

        Stream.iterate( 1, n -> n +0).limit(m).forEach(System.out::println);

        BigDecimal bd = new BigDecimal("20");
        System.out.println("Value: "+ bd.subtract(new BigDecimal(-15)));
        int[] data = {2, 5, 2, 4, 3, 2, 8, 3, 5};
        filterDuplicates(data);

        System.out.println();
        generateBin(0, 12);

        int n = 4;
        int[] arr = new int[n];
        List<String> listGen = new ArrayList<>();
        // Print all binary strings
        generateAllBinaryStrings(listGen, n, arr, 0);
        System.out.println("Generate: "+listGen);


//        Solution sol = new Solution();

    }

    public static int[] filterDuplicates(int[] data) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        List<Integer> list = new ArrayList();
        for (int i=0; i<data.length; i++) {
            if (!list.contains(data[i])) {
                list.add(data[i]);
            }
        }

//        List<Integer> res2 = Arrays.asList(data).stream().distinct().collect(Collectors.toList());
//        List<Integer> list2  =((List<Integer>) Arrays.asList(data)).stream().distinct().collect(Collectors.toList());
//        Integer[] res2 = list2.toArray(new Integer[0]);
        System.out.println("Debug messages... enter: ");
        for(int a : data)
            System.out.print(a+ "\t");

//        System.out.println("\nResult: ");
//        for(int a : res2)
//            System.out.print(a+ "\t");
        int[] res = new int[list.size()];
        System.out.println("\nResult2: ");
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
            System.out.print(list.get(i)+ "\t");
        }
        return res;
    }

    public static int calc(int[] array, int n1, int n2) {
        int res = array[n1] + array[n2];
        return res;
    }

    public static void generateBin(int i, int n)  {
        // create an empty queue and enqueue 1
        Queue<String> q = new ArrayDeque<>();
//        q.add("1");
        q.add(Integer.toBinaryString(i));

        // run `n` times
//        int i = 1;
        while (i++ <= n)
        {
            // append 0 and 1 to the front element of the queue and
            // enqueue both strings
            q.add(q.peek() + '0');
            q.add(q.peek() + '1');

            // remove the front element and print it
            System.out.print(q.poll() + ' ');
        }
        System.out.println();
    }

    static void printTheArray(int arr[], int n)
    {
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

        System.out.print(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining())+ " ");
    }

    // Function to generate all binary strings
    static void generateAllBinaryStrings(List<String> list, int n,
                                         int arr[], int i)
    {
        if (i == n)
        {
//            printTheArray(arr, n);
            list.add(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining()));
            return;
        }

        // First assign "0" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = 0;
        generateAllBinaryStrings(list, n, arr, i + 1);

        // And then assign "1" at ith position
        // and try for all other permutations
        // for remaining positions
        arr[i] = 1;
        generateAllBinaryStrings(list, n, arr, i + 1);
    }
}



