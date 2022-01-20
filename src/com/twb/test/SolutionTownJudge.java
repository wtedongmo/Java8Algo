package com.twb.test;

import java.util.*;

public class SolutionTownJudge {

    public int solution(int N, int[][] A) {
        // write your code in Java SE 8

//        Set<Integer> setAllPerson = new HashSet<>();
        Set<Integer> setTrustPerson = new HashSet<>();
        Map<Integer, Set<Integer>> mapSet = new HashMap<>();

        for(int i=0; i<A.length; i++){
            int[] b = A[i];
//            setAllPerson.add(b[0]);
//            setAllPerson.add(b[1]);
            setTrustPerson.add(b[0]);
            if(!setTrustPerson.contains(b[1])) {
                mapSet.computeIfAbsent(b[1], val -> new HashSet<>()).add(b[0]);
//                Set set = mapSet.get(b[1]);
//                if(set == null) set = new HashSet();
//                set.add(b[0]);
//                mapSet.put(b[1], set);
            }else if(mapSet.containsKey(b[1])) {
                mapSet.remove(b[1]);
            }
        }
//        System.out.println("\nAll person: "+setAllPerson);
        System.out.println("\nPerson who trust: "+setTrustPerson);
        System.out.println("\nMap result: "+mapSet);

        int judge = -1;
//        int sizeTrusted = setAllPerson.size() -1;
        for(Map.Entry<Integer, Set<Integer>> elt : mapSet.entrySet() ){
            if(!setTrustPerson.contains(elt.getKey()) && (N-1) == elt.getValue().size()){
                judge = elt.getKey();
                break;
            }
        }

        return judge;
    }

    public static void main(String[] args) {
        int[][] A= new int[][] {{1, 2}, {6, 1}, {3, 2}, {4, 1}, {6, 2}, {7, 3}, {4, 2}, {7, 2}, {8, 2}};
        SolutionTownJudge sol = new SolutionTownJudge();
        System.out.println("\nThe trusted person is: "+sol.solution(7, A));
    }

}
