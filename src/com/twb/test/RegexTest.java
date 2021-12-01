package com.twb.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static int runTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    public static void main(String[] args) {

//        int matches = runTest("\\w", "hi_");
        int matches = runTest("a{2,3}?", "aaaaaaa");
        System.out.println("Match result: "+matches);

    }
}
