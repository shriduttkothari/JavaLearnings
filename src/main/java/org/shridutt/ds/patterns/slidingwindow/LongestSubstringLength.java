package org.shridutt.ds.patterns.slidingwindow;

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
public class LongestSubstringLength {

    public int longestSubstringLength(String input) {
        if(input == null || input.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int longestSubstringLength = Integer.MIN_VALUE;


        return longestSubstringLength != Integer.MIN_VALUE ? longestSubstringLength : 0;
    }
}
