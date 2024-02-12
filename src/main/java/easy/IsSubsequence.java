package easy;

//https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("ace", "abcde"));
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() > t.length()) return false;
            int subIndex = 0;
            for (int i = 0; i < t.length(); i++) {
                if (t.length() - i < s.length() - subIndex) {
                    return false;
                }
                if (subIndex == s.length()) return true;
                if (s.charAt(subIndex) == t.charAt(i)) subIndex++;
            }
            return subIndex == s.length();
        }
    }
}
