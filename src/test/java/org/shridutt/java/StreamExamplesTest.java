package org.shridutt.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamExamplesTest {

    private static StreamExamples classUnderTest;

    @BeforeAll
    static void setup() {
        classUnderTest = new StreamExamples();
    }

    @Test
    void testConvertString() {
        //convert "this is test" into "THis IS TEst"
        assertEquals("THis IS TEst", classUnderTest.convertFirstTwoCharsToUppercase("this is test"));
    }

    @Test
    void testGetCustomerPhoneNumbers() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(101, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(102, "peter", "peter@gmail.com", 40, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        List<String> customerPhoneNumbers = classUnderTest.getCustomerPhoneNumbers(customers);

        assertArrayEquals(new String[]{"000000000", "111111111", "222222222", "333333333"}, customerPhoneNumbers.toArray());
    }

    @Test
    void testGetCustomerNames() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(101, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(102, "peter", "peter@gmail.com", 55, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        List<String> customerPhoneNumbers = classUnderTest.getCustomerNames(customers);

        assertArrayEquals(new String[]{"smith", "peter"}, customerPhoneNumbers.toArray());
    }

    @Test
    void testGetSumOfCustomerIds() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(2, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(3, "peter", "peter@gmail.com", 55, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        assertEquals(5, classUnderTest.getSumOfCustomerIds_ex1(customers));
        assertEquals(5, classUnderTest.getSumOfCustomerIds_ex2(customers));
        assertEquals(5, classUnderTest.getSumOfCustomerIds_ex3(customers));
    }

    @Test
    void testGetMultiplicationOfCustomerIds() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(2, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(3, "peter", "peter@gmail.com", 55, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        assertEquals(6, classUnderTest.getMultiplicationOfCustomerIds(customers));
    }

    @Test
    void testGetMaxOfCustomerIds() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(2, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(5, "a", "a@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(0, "b", "b@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(3, "peter", "peter@gmail.com", 55, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        assertEquals(5, classUnderTest.getMaxOfCustomerIds_ex1(customers));
        assertEquals(5, classUnderTest.getMaxOfCustomerIds_ex2(customers));
        assertEquals(5, classUnderTest.getMaxOfCustomerIds_ex3(customers));
    }

    @Test
    void testGetAverageOfCustomerIds() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(2, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(5, "a", "a@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(0, "b", "b@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(3, "peter", "peter@gmail.com", 55, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        assertEquals(2.5, classUnderTest.getAverageOfCustomerIds(customers));

    }

    @Test
    void testGroupedCustomersByAge() {
        List<StreamExamples.Customer> customers = Stream.of(
                new StreamExamples.Customer(2, "smith", "smith@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(5, "a", "a@gmail.com", 55, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(0, "b", "b@gmail.com", 40, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(0, "bsfaf", "bafasf@gmail.com", 60, Arrays.asList("000000000", "111111111")),
                new StreamExamples.Customer(3, "peter", "peter@gmail.com", 40, Arrays.asList("222222222", "333333333"))).collect(Collectors.toList());

        Map<Integer, List<StreamExamples.Customer>> groupedCustomersByAge = classUnderTest.groupedCustomersByAge(customers);
        assertEquals(2, groupedCustomersByAge.get(55).size());
        assertEquals(2, groupedCustomersByAge.get(40).size());
        assertEquals(1, groupedCustomersByAge.get(60).size());

    }

}