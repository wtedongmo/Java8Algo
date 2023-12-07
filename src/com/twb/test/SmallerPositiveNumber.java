package com.twb.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallerPositiveNumber {

    public int solution(int[] A) {

        int [] B = IntStream.of(A).filter(it -> it >0 ).distinct().sorted().toArray();
        if(B.length ==0 ) return 1;
        else {
            int smaller = 1;
            for(int val: B){
                if(val != smaller) break;
                smaller ++;
            }
            return smaller;
        }
    }
}
