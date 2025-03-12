package org.shridutt.ds.patterns.slidingwindow;

/**
 * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 *
 * Example 1:
 *
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 * Example 2:
 *
 * Input: [2, 3, 4, 1, 5], k=2
 * Output: 7
 * Explanation: Subarray with maximum sum is [3, 4].
 */
class ContiguousSubArray {

    public int maximumSumInContiguousSubArray(int inputArray[], int windowSize) {
        //handle case when array size is zero: return 0
        //handle case when windowSize > array size: return sum of array
        if (inputArray.length == 0 || windowSize > inputArray.length) {
            return 0;
        }

        int maxSum = 0;

        if (windowSize > inputArray.length) {
            for (int index = 0; index < inputArray.length; index++) {
                maxSum += inputArray[index];
            }
            return maxSum;
        }

        int windowSum = 0;
        for (int index = 0; index < windowSize; index++) {
            windowSum += inputArray[index];
        }
        maxSum = windowSum;

        for (int index = windowSize; index < inputArray.length; index++) {
            int itemToAddIntoWindowSum = inputArray[index];
            int itemToRemoveFromWindowSum = inputArray[index - windowSize];
            windowSum = windowSum + itemToAddIntoWindowSum - itemToRemoveFromWindowSum;
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }


}
