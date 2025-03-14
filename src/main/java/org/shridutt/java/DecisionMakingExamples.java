package org.shridutt.java;

public class DecisionMakingExamples {
    public boolean isGreaterThanFifteen(final int input) {
        if (input > 15) {
            return true;
        } else {
            return false;
        }
    }

    public int doubleTheInputIfInRangeOfFiveToTen(final int input) throws IllegalArgumentException {
        switch (input) {
            case 5, 6, 7, 8, 9, 10: {
                return input * 2;
            }
            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }
}
