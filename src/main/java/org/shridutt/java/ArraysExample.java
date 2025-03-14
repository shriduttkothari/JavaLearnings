package org.shridutt.java;

class ArraysExample {

    public int sumOfSingleDimensionalArrayElements(int[] singleDimentionalArray) {
        int sum = 0;
        for (int index = 0; index < singleDimentionalArray.length; index++) {
            sum += singleDimentionalArray[index];
        }
        return sum;
    }

    public int sumOfMultiDimensionalArrayElements(int[][] multiDimentionalArray) {
        int sum = 0;
        for (int row = 0; row < multiDimentionalArray.length; row++) {
            for (int column = 0; column < multiDimentionalArray[row].length; column++) {
                sum += multiDimentionalArray[row][column];
            }
        }
        return sum;
    }
}
