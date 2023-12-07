package com.twb.test;

import java.util.stream.IntStream;

public class SolutionCloseSet {

    /*
    Giving a
     */

    public int solution(int[] A) {
        // write your code in Java SE 8

        int count=0, firstLength=A.length-1;

//        Map<Integer, Integer> map = Arrays.stream(A).map( a, b -> )
        for(int i=0; i<firstLength; i++){
            final int it = i;
            count += IntStream.range(it, A.length)
                    .map(k -> A[k])
                    .filter( v -> v<A[it])
                    .count();
            if(count>1000_000_000){
                count = -1;
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A= new int[] {-1, 6, 3, 4, 7, 4};
        SolutionInversion sol = new SolutionInversion();
        System.out.println("\nInversion: "+sol.solution(A));
    }

}
