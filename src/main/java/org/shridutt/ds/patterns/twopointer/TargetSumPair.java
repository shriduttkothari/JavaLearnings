package org.shridutt.ds.patterns.twopointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 * <p>
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
 * Example 1:
 * <p>
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 * Example 2:
 * <p>
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 */
public class TargetSumPair {


    public int[] findPairWithSumUsingTwoPointer(int[] input, int targetSum) {
        if (input.length < 2) {
            throw new IllegalArgumentException("Invalid input");
        }
        int[] pairIndex = new int[]{-1, -1}; //default values if nothing found

        int leftIndex = 0;
        int rightIndex = input.length - 1;

        while (leftIndex < rightIndex) {
            int sumOfLeftAndRight = input[leftIndex] + input[rightIndex];
            if (sumOfLeftAndRight == targetSum) {
                pairIndex[0] = leftIndex;
                pairIndex[1] = rightIndex;
                return pairIndex;
            } else if (sumOfLeftAndRight > targetSum) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return pairIndex;
    }

    public int[] findPairWithSumWithoutTwoPointer(int[] input, int targetSum) {
        if (input.length < 2) {
            throw new IllegalArgumentException("Invalid input");
        }
        int[] pairIndex = new int[]{-1, -1}; //default values if nothing found

        Map<Integer, Integer> differenceMap = new HashMap<>();

        // input = [1, 2, 3, 4, 6], target=6
        for (int index = 0; index < input.length; index++) {
            differenceMap.put((targetSum - input[index]), index);
        }

        for(int index = 0; index < input.length; index++) {
            if(differenceMap.containsKey(input[index])) {
                return new int[] {index, differenceMap.get(input[index])};
            }
        }
        return pairIndex;
    }
}
