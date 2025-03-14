package org.shridutt.java;

public class StringExamples {

    public String reverseInputString(final String input) {
        if(null == input) return null;
        if(input.isBlank()) return input;
        else {
            char[] inputCharArray = input.toCharArray();
            StringBuilder output = new StringBuilder();
            for (int index = inputCharArray.length - 1; index >= 0; index--) {
                output.append(inputCharArray[index]);
            }
            return output.toString();
        }
    }
}
