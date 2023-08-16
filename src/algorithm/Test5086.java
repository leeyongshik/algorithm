package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Test5086 {

	public static void main(String[] args) {
        int[] nums = { 35000, 45000, 50000 };
        int target = 260000;

        List<List<Integer>> result = combinationSum(nums, target);

        if (result.size() > 0) {
            System.out.println("Possible combinations:");
            for (List<Integer> combination : result) {
                System.out.println(combination);
            }
        } else {
            System.out.println("No combinations found.");
        }
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, remain - nums[i], i); // Note that we can reuse the same element
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
