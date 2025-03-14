package org.shridutt.java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LoopExamples {

    public static void main(String[] args) {
        new LoopExamples().forEachLoopCompareWithForLoop();
    }

    public void forEachLoopCompareWithForLoop() {
        List<Person> personList = generate10kPersons();

        long startTime1 = Calendar.getInstance().getTimeInMillis();
        for (Person person : personList) {
            System.out.printf("Firstname: %s LastName: %s \n", person.getFirstName(), person.getLastName());
        }
        long endTime1 = Calendar.getInstance().getTimeInMillis();

        long startTime2 = Calendar.getInstance().getTimeInMillis();
        for (int index = 0; index < personList.size(); index++) {
            System.out.printf("Firstname: %s LastName: %s \n", personList.get(index).getFirstName(), personList.get(index).getLastName());
        }
        long endTime2 = Calendar.getInstance().getTimeInMillis();

        System.out.println("Time taken by forEach loop:: " + (endTime1 - startTime1) + " ms");
        System.out.println("Time taken by for loop:: " + (endTime2 - startTime2) + " ms");
    }

    private List<Person> generate10kPersons() {
        List<Person> personList = new ArrayList<>();
        for (int index = 0; index < 100000; index++) {
            personList.add(new Person("Name" + index, "LastName" + index));
        }
        return personList;
    }

    private static class Person {
        private final String firstName;
        private final String lastName;

        Person(final String name, String lastName) {
            this.firstName = name;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
