package org.shridutt.ds.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestSubArrayLengthTest {

    private static SmallestSubArrayLength classUnderTest;

    @BeforeAll
    static void setUp() {
        classUnderTest = new SmallestSubArrayLength();
    }

    @Test
    void case1() {
        assertEquals(2, classUnderTest.smallestSubArrayLength(new int[]{2, 1, 5, 2, 3, 2}, 7));
    }

    @Test
    void case2() {
        assertEquals(1, classUnderTest.smallestSubArrayLength(new int[]{2, 1, 5, 2, 8}, 7));
    }

    @Test
    void case3() {
        assertEquals(3, classUnderTest.smallestSubArrayLength(new int[]{3, 4, 1, 1, 6}, 8));
    }

}