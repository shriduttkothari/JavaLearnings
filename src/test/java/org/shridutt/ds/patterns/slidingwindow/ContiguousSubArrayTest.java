package org.shridutt.ds.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContiguousSubArrayTest {

    private static ContiguousSubArray classUnderTest;

    @BeforeAll
    static void setUp() {
        classUnderTest = new ContiguousSubArray();
    }

    @Test()
    void testMaximumSumInContiguousSubArrayCase1() {
        assertEquals(0, classUnderTest.maximumSumInContiguousSubArray(new int[0], 10));
    }

    @Test()
    void testMaximumSumInContiguousSubArrayCase2() {
        assertEquals(1, classUnderTest.maximumSumInContiguousSubArray(new int[]{1}, 5));
    }

    @Test()
    void testMaximumSumInContiguousSubArrayCase3() {
        assertEquals(9, classUnderTest.maximumSumInContiguousSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    @Test()
    void testMaximumSumInContiguousSubArrayCase4() {
        assertEquals(7, classUnderTest.maximumSumInContiguousSubArray(new int[]{2, 3, 4, 1, 5}, 2));
    }
}