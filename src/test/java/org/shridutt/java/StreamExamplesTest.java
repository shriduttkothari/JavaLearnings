package org.shridutt.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StreamExamplesTest {

    private static StreamExamples classUnderTest;

    @BeforeAll
    static void setup() {
        classUnderTest = new StreamExamples();
    }

    @Test
    void testGetCustomerPhoneNumbers() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(101, "smith", "smith@gmail.com", Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(102, "peter", "peter@gmail.com", Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        List<String> customerPhoneNumbers = classUnderTest.getCustomerPhoneNumbers(customers);

        assertArrayEquals(new String[]{"000000000", "111111111", "222222222", "333333333"}, customerPhoneNumbers.toArray());
    }

    @Test
    void testGetCustomerNames() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(101, "smith", "smith@gmail.com", Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(102, "peter", "peter@gmail.com", Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        List<String> customerPhoneNumbers = classUnderTest.getCustomerNames(customers);

        assertArrayEquals(new String[]{"smith", "peter"}, customerPhoneNumbers.toArray());
    }
}