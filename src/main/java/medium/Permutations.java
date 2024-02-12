package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
    }

    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            backtrack(list, new ArrayList<>(), nums);
            return list;
        }

        private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
            if (tempList.size() == nums.length) {
                list.add(new ArrayList<>(tempList));
            } else {
                for (int num : nums) {
                    if (tempList.contains(num)) continue;
                    tempList.add(num);
                    backtrack(list, tempList, nums);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}
