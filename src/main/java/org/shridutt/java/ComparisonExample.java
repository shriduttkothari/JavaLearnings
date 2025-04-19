package org.shridutt.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jsoup.internal.StringUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparisonExample {

    private static Integer[] data = {50, 32, 3, 5, 6, 77, 8, 898};
    private static String[] dataStr = {"Akshay", "Amitabh", "Aam"};


    public static void sortElements(Employee[] employees) {
        Arrays.sort(data, Collections.reverseOrder());
        Arrays.sort(dataStr, Collections.reverseOrder());

        Arrays.sort(employees);

        for (int i : data) {
            System.out.println(i);
        }
        System.out.println("---------------");
        for (String i : dataStr) {
            System.out.println(i);
        }

        System.out.println("---------------");
        for (Employee emp : employees) {
            System.out.println(emp.name);
        }

        Arrays.sort(employees, new EmployeeComparatorByName());
        System.out.println("---------------");
        for (Employee emp : employees) {
            System.out.println(emp.name);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Shridutt", 30);
        employees[1] = new Employee("Ani", 35);
        employees[2] = new Employee("Vinay", 40);
        employees[3] = new Employee("Dima", 34);
        employees[4] = new Employee("Valerii", 39);

        sortElements(employees);
    }

    //Comparable, Comparator
    @AllArgsConstructor
    @Data
    public static class Employee implements Comparable<Employee>{
        String name;
        int age;

        @Override
        public int compareTo(Employee anotherEmployee) {
            // You need to write on which basis this method compare opbjects
            return this.age -anotherEmployee.age;
        }
    }

    public static class EmployeeComparatorByName implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    }

}
