package org.shridutt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionMakingExamplesTest {

    private static DecisionMakingExamples classUnderTest;

    @BeforeAll
    static void setUp() {
        classUnderTest = new DecisionMakingExamples();
    }

    @Test
    void testIsGreaterThanFifteen() {
        assertEquals(false, classUnderTest.isGreaterThanFifteen(14));
        assertEquals(false, classUnderTest.isGreaterThanFifteen(15));
        assertEquals(true, classUnderTest.isGreaterThanFifteen(16));
    }

    @Test
    void testDoubleTheInputIfInRangeOfFiveToTen() {
        assertEquals(10, classUnderTest.doubleTheInputIfInRangeOfFiveToTen(5));
        assertEquals(12, classUnderTest.doubleTheInputIfInRangeOfFiveToTen(6));
        assertEquals(14, classUnderTest.doubleTheInputIfInRangeOfFiveToTen(7));
        assertEquals(16, classUnderTest.doubleTheInputIfInRangeOfFiveToTen(8));
        assertEquals(18, classUnderTest.doubleTheInputIfInRangeOfFiveToTen(9));
        assertEquals(20, classUnderTest.doubleTheInputIfInRangeOfFiveToTen(10));

        assertThrows(IllegalArgumentException.class, () -> classUnderTest.doubleTheInputIfInRangeOfFiveToTen(4), "Invalid input!");
        assertThrows(IllegalArgumentException.class, () -> classUnderTest.doubleTheInputIfInRangeOfFiveToTen(11), "Invalid input!");

    }


}