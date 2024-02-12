package easy;

//https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    static class Solution {
        public boolean isPalindrome(String s) {
            if (s.isEmpty()) return true;
            int p1 = 0;
            int p2 = s.length() - 1;

            while (p1 <= p2) {
                char char1 = s.charAt(p1);
                char char2 = s.charAt(p2);
                if (!Character.isLetterOrDigit(char1)) {
                    p1++;
                } else if (!Character.isLetterOrDigit(char2)) {
                    p2--;
                } else {
                    if (Character.toLowerCase(char1) != Character.toLowerCase(char2)) {
                        return false;
                    }
                    p1++;
                    p2--;
                }
            }
            return true;
        }
    }
}
