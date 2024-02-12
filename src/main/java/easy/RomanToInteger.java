package easy;

import java.util.HashMap;
//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIX"));
    }

    static class Solution {
        private static final HashMap<Character, Integer> map = new HashMap<>();

        static {
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        }

        public int romanToInt(String s) {
            int sum = 0;
            int prev = 0;
            char[] symbols = s.toCharArray();

            for (int i = symbols.length - 1; i >= 0; i--) {
                int value = map.get(symbols[i]);

                if (value < prev)
                    sum -= value;
                else
                    sum += value;

                prev = value;
            }
            return sum;
        }
    }
}
