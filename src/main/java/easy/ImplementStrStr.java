package easy;

//https://leetcode.com/problems/implement-strstr/
public class ImplementStrStr {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.strStr("hello", ""));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    }
}
