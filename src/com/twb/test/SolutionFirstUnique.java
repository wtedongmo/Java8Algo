package com.twb.test;

import java.util.ArrayList;
import java.util.List;

public class SolutionFirstUnique {

    public int solution(int[] A){

        List<Integer> set = new ArrayList<>();
        for(Integer i: A){
            if(set.contains(i))
                set.remove(i);
            else set.add(i);
        }
        if(set.size()>0) return set.get(0);
        return -1;
    }

    // Find first unique number
//        int[] A = new int[]{1, 5, 2, 8, 7, 6, 4, 2, 1, 6, 7, 5, 4, 8};
    //        System.out.println("\nFirst Unique: "+sol.solution(A));

}
