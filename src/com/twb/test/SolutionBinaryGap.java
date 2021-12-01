package com.twb.test;

import java.util.Arrays;

public class SolutionBinaryGap {

    public int solution(int N) {

        char[] binChar = Integer.toBinaryString(N).toCharArray();
        System.out.println("\nBinary rep: "+ Arrays.toString(binChar));
        int maxGap = 0, curGap = 0;
        int length = binChar.length -1;
        for (int i=0; i < length ; i++) {
            if (binChar[i] == '0' )
                curGap++;
            else {
                maxGap = maxGap > curGap ? maxGap : curGap;
                curGap = 0;
            }
        }
        if (binChar[length] == '1' ) maxGap = maxGap > curGap ? maxGap : curGap;
        return maxGap;
    }

    //        System.out.println("Longest binary gap: "+sol.solution(647 ));

}
