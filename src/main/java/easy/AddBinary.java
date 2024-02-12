package easy;

//https://leetcode.com/problems/add-binary/
public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("10", "1"));
    }

    static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder Sum = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            while (i >= 0 || j >= 0) {
                int bitSum = carry;
                if (i >= 0) bitSum += a.charAt(i) - '0';
                if (j >= 0) bitSum += b.charAt(j) - '0';
                Sum.append(bitSum % 2);
                carry = bitSum / 2;
                i--;
                j--;
            }
            if (carry != 0) {
                Sum.append(carry);
            }
            return Sum.reverse().toString();
        }
    }
}