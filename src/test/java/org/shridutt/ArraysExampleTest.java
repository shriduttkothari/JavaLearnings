package org.shridutt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ArraysExampleTest {

    private ArraysExample arraysExample;

    @BeforeAll
    void setup() {
        arraysExample = new ArraysExample();
    }

    @Test
    void testSumOfSingleDimensionalArrayElements() {
        int[] input1 = {10, 10, 1, 1};
        int result = arraysExample.sumOfSingleDimensionalArrayElements(input1);
        assertEquals(22, result);


        int[] input2 = IntStream.range(1, 5).toArray(); // excludes 5
        int result2 = arraysExample.sumOfSingleDimensionalArrayElements(input2);
        assertEquals(10, result2);

        int[] input3 = IntStream.rangeClosed(1, 4).toArray(); // includes 4
        int result3 = arraysExample.sumOfSingleDimensionalArrayElements(input3);
        assertEquals(10, result2);
    }

    @Test
    void testSumOfMultiDimensionalArrayElements() {
        int[][] input = {{10, 10}, {1, 1}};
        int result = arraysExample.sumOfMultiDimensionalArrayElements(input);
        assertEquals(22, result);
    }

}