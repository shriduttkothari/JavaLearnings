package org.shridutt.ds.patterns.twopointer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Input: [-3, 0, 1, 2, -1, 1, -2]
 * Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
 *
 * Input: [-5, 2, -1, -2, 3]
 * Output: [[-5, 2, 3], [-2, -1, 3]]
 */
class TripletSumToZeroTest {

    private static TripletSumToZero classUnderTest;

    @BeforeAll
    static void setup() {
        classUnderTest = new TripletSumToZero();
    }

    @Disabled
    @Test
    void case1() {
        List<int []> result = classUnderTest.findTripletSumToZero(new int[] {-3, 0, 1, 2, -1, 1, -2});
        assertEquals(4, result.size());
        assertArrayEquals(new int [] {-3, 1, 2}, result.get(0));
        assertArrayEquals(new int [] {-2, 0, 2}, result.get(1));
        assertArrayEquals(new int [] {-2, 1, 1}, result.get(2));
        assertArrayEquals(new int [] {-1, 0, 1}, result.get(3));
    }

    @Disabled
    @Test
    void case2() {
        List<int []> result = classUnderTest.findTripletSumToZero(new int[] {-5, 2, -1, -2, 3});
        assertEquals(2, result.size());
        assertArrayEquals(new int [] {-5, 2, 3}, result.get(0));
        assertArrayEquals(new int [] {-2, -1, 3}, result.get(1));
    }
}