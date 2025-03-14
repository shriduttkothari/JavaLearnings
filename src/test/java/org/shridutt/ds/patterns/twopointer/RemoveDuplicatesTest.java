package org.shridutt.ds.patterns.twopointer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the new length of the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [2, 3, 3, 3, 6, 9, 9]
 * Output: 4
 * Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
 * Example 2:
 * <p>
 * Input: [2, 2, 2, 11]
 * Output: 2
 * Explanation: The first two elements after removing the duplicates will be [2, 11].
 */
public class RemoveDuplicatesTest {

    private static RemoveDuplicates classUnderTest;

    @BeforeAll
    static void setup() {
        classUnderTest = new RemoveDuplicates();
    }

    @Test
    void case1() {
        assertEquals(4, classUnderTest.getLengthAfterRemovingDuplicates(new int[] {2, 3, 3, 3, 6, 9, 9}));
    }

    @Test
    void case2() {
        assertEquals(4, classUnderTest.getLengthAfterRemovingDuplicates(new int[] {2, 3, 3, 3, 6, 9, 9}));
    }

    @Test
    void case3() {
        assertEquals(0, classUnderTest.getLengthAfterRemovingDuplicates(new int[] {}));
    }

    @Test
    void case4() {
        assertEquals(1, classUnderTest.getLengthAfterRemovingDuplicates(new int[] {2}));
    }
    @Test
    void case5() {
        assertEquals(2, classUnderTest.getLengthAfterRemovingDuplicates(new int[] {2,3}));
    }
}
