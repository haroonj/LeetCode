package medium;

import java.util.HashSet;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> hashSet = new HashSet<>();
            int i = 0, j = 0, count = 0;
            while (j < s.length()) {
                if (!hashSet.contains(s.charAt(j))) {
                    hashSet.add(s.charAt(j++));
                    count = Math.max(count, hashSet.size());
                } else {
                    hashSet.remove(s.charAt(i++));
                }
            }

            return count;
        }
    }
}
