package org.shridutt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

//We need to use this : @TestInstance(TestInstance.Lifecycle.PER_CLASS) so we don't need to make @BeforeAll setup method static in Junit 5
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringExamplesTest {

    private StringExamples classUnderTest;

    @BeforeAll
    void setUp() {
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