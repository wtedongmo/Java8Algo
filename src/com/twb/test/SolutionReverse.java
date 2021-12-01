package com.twb.test;

public class SolutionReverse {

    public int solution(String S) {
        if(S == null || S.length() <=1) return 0;

        StringBuilder input1 = new StringBuilder();
        input1.append(S);
        String revers = input1.reverse().toString();
        char[] chars = S.toCharArray();
        char[] revChars = revers.toCharArray();
        int result=0;
        int length=chars.length/2 ;
        for(int i=0; i<length; i++){
            if(chars[i] != revChars[i])
                break;
            result++;
        }

        return result>0 ? result: -1;
    }

    //        System.out.println("\nReverse String count: "+sol.solution("racecar"));

}
