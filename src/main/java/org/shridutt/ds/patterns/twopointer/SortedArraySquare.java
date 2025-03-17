package org.shridutt.ds.patterns.twopointer;

/**
 * Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.
 *
 * Example 1:
 *
 * Input: [-2, -1, 0, 2, 3]
 * Output: [0, 1, 4, 4, 9]
 * Example 2:
 *
 * Input: [-3, -1, 0, 1, 2]
 * Output: [0, 1, 1, 4, 9]
 */
public class SortedArraySquare {
    public int[] foo(int[] input) {
        int index = 0;
        while(input[index] < 0 && index < input.length) {
            index++;
        }
        int rightIndex = index; //first positive element or may be end of array
        int leftIndex = index -1;

        int result [] = new int [input.length];

        index = 0;
        while(leftIndex > -1 && rightIndex <input.length) {
            int leftSquare = input[leftIndex] * input[leftIndex];
            int rightSquare = input[rightIndex] * input[rightIndex];

            if(rightSquare > leftSquare) {
                result[index++] = leftSquare;
                leftIndex--;
            } else if(leftSquare > rightSquare) {
                result[index++] = rightSquare;
                rightIndex++;
            } else {
                result[index++] = leftSquare;
                result[index++] = rightSquare;
                leftIndex--;
                rightIndex++;
            }
        }
        while(leftIndex > -1) {
            int leftSquare = input[leftIndex] * input[leftIndex];
            result[index++] = leftSquare;
            leftIndex--;
        }
        while(rightIndex <input.length) {
            int rightSquare = input[rightIndex] * input[rightIndex];
            result[index++] = rightSquare;
            rightIndex++;
        }

        return result;
    }
}
