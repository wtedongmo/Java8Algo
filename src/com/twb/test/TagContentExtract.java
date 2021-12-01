package com.twb.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtract {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            boolean matchFound = false;
            Pattern TAG_REGEX = Pattern.compile("<(.+)>([^<]+)</\\1>", Pattern.DOTALL);
            Matcher matcher = TAG_REGEX.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
