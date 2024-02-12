package easy;

//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(10));
    }

    static class Solution {
        public static boolean isPalindrome(int x) {
            String number = String.valueOf(x);
            int size = number.length() / 2;
            for (int i = 0; i < size; i++) {
                if (number.charAt(i) != number.charAt(number.length() - 1 - i))
                    return false;
            }
            return true;
        }
    }
}
