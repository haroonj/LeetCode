package easy;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("play GTA5"));
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') length++;
                else if (length > 0) return length;
            }

            return length;
        }
    }
}
