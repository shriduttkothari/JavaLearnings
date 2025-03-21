package org.shridutt.java;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    /**
     * stream.flatMap() example
     */
    public List<String> getCustomerPhoneNumbers(List<Customer> customerList) {
        List<String> customerPhoneNumbers = customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        return customerPhoneNumbers;
    }

    /**
     * stream.map() example
     */
    public List<String> getCustomerNames(List<Customer> customerList) {
        List<String> customerNames = customerList.stream().map(customer -> customer.getName()).collect(Collectors.toList());
        return customerNames;
    }

    public static class Customer {
        private int id;
        private String name;
        private String email;
        private List<String> phoneNumbers;

        public Customer() {
        }

        public Customer(int id, String name, String email, List<String> phoneNumbers) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phoneNumbers = phoneNumbers;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }
    }

}
