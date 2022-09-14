package org.example.easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 */
public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int copyX = 0;
        int exit = x;
        while (exit > 0) {
            int del = exit % 10;
            copyX = copyX * 10 + del;
            exit /= 10;
        }
        return copyX == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
