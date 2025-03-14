package org.shridutt.ds.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Given a string, find the length of the longest substring which has no repeating characters.
 *
 * Example 1:
 *
 * Input: String="aabccbb"
 * Output: 3
 * Explanation: The longest substring without any repeating characters is "abc".
 *
 * Example 2:
 *
 * Input: String="abbbb"
 * Output: 2
 * Explanation: The longest substring without any repeating characters is "ab".
 *
 * Example 3:
 *
 * Input: String="abccde"
 * Output: 3
 * Explanation: Longest substrings without any repeating characters are "abc" & "cde".
 */

class LongestSubstringLengthTest {

    private static LongestSubstringLength classUnderTest;

    @BeforeAll
    static void setup() {
        classUnderTest = new LongestSubstringLength();
    }

    @Test
    private void case1() {
        assertEquals(3, classUnderTest.longestSubstringLength("aabccbb"));
    }

    @Test
    private void case2() {
        assertEquals(2, classUnderTest.longestSubstringLength("abbbb"));
    }

    @Test
    private void case3() {
        assertEquals(3, classUnderTest.longestSubstringLength("abccde"));
    }

    @Test
    private void case4() {
        assertThrows(IllegalArgumentException.class, () -> classUnderTest.longestSubstringLength(null));
    }

    @Test
    private void case5() {
        assertThrows(IllegalArgumentException.class, () -> classUnderTest.longestSubstringLength(""));
    }

}