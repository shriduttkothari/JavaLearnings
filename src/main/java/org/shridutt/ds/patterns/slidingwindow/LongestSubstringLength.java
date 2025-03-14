package org.shridutt.ds.patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
        if (input == null || input.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int longestSubstringLength = Integer.MIN_VALUE;
        int leftIndex = 0;
        StringBuilder subStringWindow = new StringBuilder();
        Map<Character, Integer> characterFrequency = new HashMap<>();

        for (int rightIndex = 0; rightIndex < input.length(); rightIndex++) {
            subStringWindow.append(input.charAt(rightIndex));
            characterFrequency.put(input.charAt(rightIndex), characterFrequency.getOrDefault(input.charAt(rightIndex), 0) +1); //increment the frequency of char at rightIndex

            while(characterFrequency.getOrDefault(input.charAt(rightIndex), 0) > 1) { //condition which we don't want to allow
                longestSubstringLength = Math.max(longestSubstringLength, (rightIndex-leftIndex)); 
                characterFrequency.put(input.charAt(rightIndex), characterFrequency.getOrDefault(input.charAt(rightIndex), 0) -1);
                leftIndex++;
                if (characterFrequency.get(input.charAt(leftIndex)) == 0) {
                    characterFrequency.remove(input.charAt(leftIndex));
                }
            }
        }
        return longestSubstringLength != Integer.MIN_VALUE ? longestSubstringLength : 0;
    }
}
