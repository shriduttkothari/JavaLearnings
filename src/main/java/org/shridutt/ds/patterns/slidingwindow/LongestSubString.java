package org.shridutt.ds.patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct(different) characters.
 * <p>
 * Example 1:
 * <p>
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct(different) characters is "araa".
 * <p>
 * Example 2:
 * <p>
 * Input: String="araaci", K=1
 * Output: 2
 * Explanation: The longest substring with no more than '1' distinct(different) characters is "aa".
 * <p>
 * Example 3:
 * <p>
 * Input: String="cbbebi", K=3
 * Output: 5
 * Explanation: The longest substrings with no more than '3' distinct(different) characters are "cbbeb" & "bbebi"
 */
public class LongestSubString {

    public int findLongestSubstringLength(String input, int k) {
        if (input == null || input.length() == 0 || input.length() < k) {
            throw new IllegalArgumentException("Invalid input value");
        }

        int longestSubStringLength = Integer.MIN_VALUE;
        int leftIndex = 0;
        Map<Character, Integer> distinctCharacters = new HashMap<>();
        for (int rightIndex = 0; rightIndex < input.length(); rightIndex++) {
            distinctCharacters.put(input.charAt(rightIndex), distinctCharacters.getOrDefault(input.charAt(rightIndex), 0) + 1); // increment the count of the rightIndex character
            while (distinctCharacters.size() > k) { //condition which we don't want to allow
                longestSubStringLength = Math.max(longestSubStringLength, (rightIndex - leftIndex));
                distinctCharacters.put(input.charAt(leftIndex), distinctCharacters.get(input.charAt(leftIndex)) - 1); // decrement the count of the leftIndex character
                if (distinctCharacters.get(input.charAt(leftIndex)) == 0) {
                    distinctCharacters.remove(input.charAt(leftIndex));
                }
                leftIndex++;
            }
        }
        return longestSubStringLength != Integer.MIN_VALUE ? longestSubStringLength: 0;
    }
}
