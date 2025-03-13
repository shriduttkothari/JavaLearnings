package org.shridutt.ds.patterns.slidingwindow;

/**
 * Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
 *
 * Example 1:
 *
 * Input: [2, 1, 5, 2, 3, 2], S=7
 * Output: 2
 * Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
 * Example 2:
 *
 * Input: [2, 1, 5, 2, 8], S=7
 * Output: 1
 * Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].
 * Example 3:
 *
 * Input: [3, 4, 1, 1, 6], S=8
 * Output: 3
 * Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1] or [1, 1, 6].
 */
public class SmallestSubArrayLength {

    public int smallestSubArrayLength(int[] inputArray, int s) {
        int lengthOfSmallestSubArray = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < inputArray.length; windowEnd++) {
            windowSum = windowSum + inputArray[windowEnd];

            while (windowSum >= s) {
                lengthOfSmallestSubArray = Math.min(lengthOfSmallestSubArray, ((windowEnd-windowStart) + 1));
                windowSum = windowSum - inputArray[windowStart];
                windowStart++;
            }
        }
        return lengthOfSmallestSubArray != Integer.MAX_VALUE ? lengthOfSmallestSubArray:0;
    }
}
