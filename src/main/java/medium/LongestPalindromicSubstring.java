package medium;
//https://leetcode.com/problems/longest-palindromica-substring/
public class LongestPalindromicSubstring {
    public static void main(String[] args){
        Solution solution  = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
    }
    static class Solution {
        private int low, maxLen;
        public String longestPalindrome(String s) {
            int len = s.length();
            if (len < 2)
                return s;

            for (int i = 0; i < len-1; i++) {
                extendPalindrome(s, i, i);
                extendPalindrome(s, i, i+1);
            }
            return s.substring(low, low + maxLen);
        }

        private void extendPalindrome(String s, int j, int k) {
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
            }
            if (maxLen < k - j - 1) {
                low = j + 1;
                maxLen = k - j - 1;
            }
        }
    }
}
