package org.shridutt.ds.patterns.twopointer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.
 *
 *
 * Input: [-2, -1, 0, 2, 3]
 * Output: [0, 1, 4, 4, 9]
 *
 * Input: [-3, -1, 0, 1, 2]
 * Output: [0, 1, 1, 4, 9]
 *
 * Input: [-5, -3, -1, 0, 1, 2]
 * Output: [0, 1, 1, 4, 9, 25]
 *
 * Input: [-1, 0, 1, 2, 4]
 * Output: [0, 1, 1, 4, 16]
 */
class SortedArraySquareTest {


    private static SortedArraySquare classUnderTest;

    @BeforeAll
    static void setUp() {
        classUnderTest = new SortedArraySquare();
    }

    @Test
    void case1() {
        int [] inputArray = new int [] {-2, -1, 0, 2, 3};

        int [] actual = classUnderTest.foo(inputArray);
        int[] expected = new int [] {0, 1, 4, 4, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    void case2() {
        assertArrayEquals(new int [] {0, 1, 1, 4, 9}, classUnderTest.foo(new int [] {-3, -1, 0, 1, 2}));
    }

    @Test
    void case3() {
        assertArrayEquals(new int [] {0, 1, 1, 4, 9, 25}, classUnderTest.foo(new int [] {-5, -3, -1, 0, 1, 2}));
    }

    @Test
    void case4() {
        assertArrayEquals(new int [] {0, 1, 1, 4, 16}, classUnderTest.foo(new int [] {-1, 0, 1, 2, 4}));
    }
}