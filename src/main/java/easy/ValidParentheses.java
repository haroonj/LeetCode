package easy;

import java.util.LinkedList;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "{()[]}";
        System.out.println(solution.isValid(s));
    }

    static class Solution {
        public boolean isValid(String s) {
            LinkedList<Character> linkedList = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') linkedList.addLast(ch);
                else if (ch == ')' && !linkedList.isEmpty() && linkedList.getLast() == '(') linkedList.removeLast();
                else if (ch == '}' && !linkedList.isEmpty() && linkedList.getLast() == '{') linkedList.removeLast();
                else if (ch == ']' && !linkedList.isEmpty() && linkedList.getLast() == '[') linkedList.removeLast();
                else return false;
            }
            return linkedList.isEmpty();
        }
    }
}
