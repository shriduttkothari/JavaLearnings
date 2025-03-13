package org.shridutt.ds.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 *
 * Example 1:
 *
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct characters is "araa".
 * Example 2:
 *
 * Input: String="araaci", K=1
 * Output: 2
 * Explanation: The longest substring with no more than '1' distinct characters is "aa".
 * Example 3:
 *
 * Input: String="cbbebi", K=3
 * Output: 5
 * Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi"
 */
class LongestSubStringTest {

    private static LongestSubString classUnderTest;

    @BeforeAll
    static void setup() {
        classUnderTest = new LongestSubString();
    }

    @Test
    void case1() {
        assertEquals(4, classUnderTest.findLongestSubstringLength("araaci", 2));
    }

}