package easy;

//import java.util.HashSet;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{}));
    }

    static class Solution {
        public int singleNumber(int[] nums) {
/*            int num = 0;
            HashSet<Integer> integers = new HashSet<>();
            for (Integer i : nums) {
                if (integers.contains(i)) {
                    num -= i;
                } else {
                    integers.add(i);
                    num += i;
                }
            }
            return num;

 */
            int result = 0;
            for (int curr : nums) {
                result = result ^ curr;
            }
            return result;
        }
    }
}
