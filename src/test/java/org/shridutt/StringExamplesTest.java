package org.shridutt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExamplesTest {

    private static StringExamples classUnderTest;

    @BeforeAll
    static void setUp() {
        classUnderTest = new StringExamples();
    }

    @Test
    void testReverseInputString() {
        assertEquals("ttudirhS", classUnderTest.reverseInputString("Shridutt"));
        assertEquals("        ", classUnderTest.reverseInputString("        "));
        assertEquals("", classUnderTest.reverseInputString(""));
        assertNull(classUnderTest.reverseInputString(null));
    }
}