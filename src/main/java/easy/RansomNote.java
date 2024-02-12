package easy;

public class RansomNote {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa","aba"));
    }

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.isEmpty() || magazine.isEmpty() || ransomNote.length() > magazine.length())
                return false;
            int[] counter = new int[26];

            for (char c : magazine.toCharArray())
                counter[c - 'a']++;

            for (char c : ransomNote.toCharArray()) {
                if (counter[c - 'a'] == 0)
                    return false;
                counter[c - 'a']--;
            }
            return true;
        }
    }
}

