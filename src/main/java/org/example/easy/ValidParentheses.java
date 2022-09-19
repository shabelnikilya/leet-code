package org.example.easy;

import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {
   static Map<Character, Character> characterMap = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
    );

    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (characterMap.containsValue(c)) {
                stack.push(c);
            } else if (characterMap.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != characterMap.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));
    }
}
