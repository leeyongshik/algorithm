package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5086 {
	
	
	public static void main(String[] args) {
        int[] numbers = {35000, 45000, 50000};
        int targetSum = 35000;

        boolean foundCombination = findCombination(numbers, targetSum);

        if (!foundCombination) {
            System.out.println("No combination found to achieve the target sum.");
        }
    }

    public static boolean findCombination(int[] numbers, int targetSum) {
        Arrays.sort(numbers); // 정렬하여 조합을 효율적으로 검사

        return findCombinationHelper(numbers, targetSum, 0, 0);
    }

    public static boolean findCombinationHelper(int[] numbers, int targetSum, int currentIndex, int currentSum) {
        if (currentSum == targetSum) {
            return true; 
        }

        if (currentSum > targetSum || currentIndex >= numbers.length) {
            return false;
        }

        // 현재 인덱스의 숫자를 포함하지 않는 경우
        if (findCombinationHelper(numbers, targetSum, currentIndex + 1, currentSum)) {
            return true;
        } 

        // 현재 인덱스의 숫자를 포함하는 경우
        if (findCombinationHelper(numbers, targetSum, currentIndex + 1, currentSum + numbers[currentIndex])) {
            System.out.println("Combination found: " + numbers[currentIndex]);
            return true ;  
        }

        return false; 
    }
	
	
	

//	public static void main(String[] args) {
//        int[] nums = { 35000, 45000, 50000 };
//        int target = 260000;
//
//        List<List<Integer>> result = combinationSum(nums, target);
//
//        if (result.size() > 0) {
//            System.out.println("Possible combinations:");
//            for (List<Integer> combination : result) {
//                System.out.println(combination);
//            }
//        } else {
//            System.out.println("No combinations found.");
//        }
//    }
//
//    public static List<List<Integer>> combinationSum(int[] nums, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(result, new ArrayList<>(), nums, target, 0);
//        return result;
//    }
//
//    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int remain, int start) {
//        if (remain < 0) {
//            return;
//        } else if (remain == 0) {
//            result.add(new ArrayList<>(tempList));
//        } else {
//            for (int i = start; i < nums.length; i++) {
//                tempList.add(nums[i]);
//                backtrack(result, tempList, nums, remain - nums[i], i); // Note that we can reuse the same element
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//    }
}
