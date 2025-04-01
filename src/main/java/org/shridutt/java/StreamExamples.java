package org.shridutt.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamExamples {


    public String convertFirstTwoCharsToUppercase(String input) {
        String[] wordsArray = input.split(" ");
        String result = Arrays.stream(wordsArray)
                .map(word -> word.length() > 1 ? word.substring(0, 2).toUpperCase() + word.substring(2)
                        : word.toUpperCase()
                ).collect(Collectors.joining(" "));
        return result;
    }


    /**
     * stream.flatMap() example
     */
    public List<String> getCustomerPhoneNumbers(List<Customer> customerList) {
        var customerPhoneNumbers = customerList.stream() //Stream<Customer>
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        return customerPhoneNumbers;
    }

    /**
     * stream.map() example
     */
    public List<String> getCustomerNames(List<Customer> customerList) {
        var customerNames = customerList.stream().map(customer -> customer.getName()).collect(Collectors.toList());
        return customerNames;
    }

    /**
     * stream.reduce() example with initial value 0
     */
    public int getSumOfCustomerIds_ex1(List<Customer> customerList) {
        //reduce takes first arg as initial value, so if we want to do sum, we pass 0
        return customerList.stream().map(customer -> customer.getId()).reduce(0, (a, b) -> a + b);
    }

    /**
     * stream.reduce() example with method reference
     */
    public int getSumOfCustomerIds_ex2(List<Customer> customerList) {
        //reduce also takes method reference or lambda and returns optional
        return customerList.stream().map(customer -> customer.getId()).reduce(Integer::sum).get();
    }

    /**
     * stream.reduce() example with lambda
     */
    public int getSumOfCustomerIds_ex3(List<Customer> customerList) {
        //reduce also takes method reference or lambda and returns optional
        return customerList.stream().map(customer -> customer.getId()).reduce((a, b) -> a + b).get();
    }

    /**
     * stream.reduce() example with initial value 0
     */
    public int getMaxOfCustomerIds_ex1(List<Customer> customerList) {
        //reduce takes first arg as initial value, so if we want to  compare, we pass 0
        return customerList.stream().map(customer -> customer.getId()).reduce(0, (a, b) -> a > b ? a : b);
    }

    /**
     * stream.reduce() example with method reference
     */
    public int getMaxOfCustomerIds_ex2(List<Customer> customerList) {
        //reduce also takes method reference or lambda and returns optional
        return customerList.stream().map(customer -> customer.getId()).reduce(Integer::max).get();
    }

    /**
     * stream.reduce() example with lambda
     */
    public int getMaxOfCustomerIds_ex3(List<Customer> customerList) {
        //reduce also takes method reference or lambda and returns optional
        return customerList.stream().map(customer -> customer.getId()).reduce((a, b) -> a > b ? a : b).get();
    }

    /**
     * stream.reduce() example with initial value 1
     */
    public int getMultiplicationOfCustomerIds(List<Customer> customerList) {
        //reduce takes first arg as initial value, so if we want to do multiplication we shall pass 1
        return customerList.stream().map(customer -> customer.getId()).reduce(1, (a, b) -> a * b);
    }


    /**
     * stream.mapToDouble() example with average method
     */
    public double getAverageOfCustomerIds(List<Customer> customerList) {
        //mapToDouble returns DoubleStream class
        return customerList.stream().map(customer -> customer.getId()).mapToInt(i -> i).average().getAsDouble();
    }

    public Map<Integer, List<Customer>> groupedCustomersByAge(List<Customer> customers) {

        Map<Integer, List<Customer>> groupedCustomersByAge = customers.stream().collect(Collectors.groupingBy(customer -> customer.getAge()));

        return groupedCustomersByAge;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Customer {
        private int id;
        private String name;
        private String email;
        private int age;
        private List<String> phoneNumbers;

    }

//    private class Employee {
//
//        private final String name;
//
//        private Employee(String name) {
//            this.name = name;
//        }
//    }

    private record Employee(String name) {
    }
}

