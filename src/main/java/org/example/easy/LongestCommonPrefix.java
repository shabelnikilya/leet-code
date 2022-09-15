package org.example.easy;


import java.util.*;

/**
 *Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int idx = 0;
        Arrays.sort(strs);
        String minLength = strs[0];
        if (minLength.isEmpty()) {
            return "";
        }
        for (int i = 0; i < minLength.length(); i++) {
            char c = minLength.charAt(i);
            boolean notEquals = false;

            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    notEquals = true;
                    break;
                }
            }
            if (notEquals) {
                break;
            }
            idx++;
        }

        return minLength.substring(0, idx);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flowers", "flay", "flog el"};
        System.out.println(longestCommonPrefix(strs));
    }
}
