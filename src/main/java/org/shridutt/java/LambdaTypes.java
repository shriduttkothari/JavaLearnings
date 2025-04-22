package org.shridutt.java;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTypes {

    public static void main(String[] args) {

        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("---------Consumer Example ---------");
        consumerExample(data);
        System.out.println("---------Function Example ---------");
        functionExample(data);
        System.out.println("---------Predicate Example ---------");
        predicateExample(data);
        System.out.println("---------Supplier Example ---------");
        supplierExample(data);
    }

    private static void consumerExample(List<Integer> data) {
        //Consumer is a functional interface which takes 1 input and consume it
        Consumer<Integer> consumer1 = System.out::println;
        Consumer<Integer> consumer2 = i-> System.out.println(i);

        data.forEach(consumer1);
        System.out.println("---------");
        data.forEach(consumer2);

    }

    private static void functionExample(List<Integer> data) {
        //Function is a functional interface which takes 1 input and gives 1 output
        Function<Integer, String> functionToConvertToString = i ->  "String-" + i;
        Function<Integer, Integer> functionToReturnIntegerSquares = i -> i * i;

        data.stream()
                .map(functionToConvertToString)
                .forEach(System.out::println);

        System.out.println("---------");
        data.stream()
                .map(functionToReturnIntegerSquares)
                .forEach(System.out::println);
    }

    private static void predicateExample(List<Integer> data) {
        //Predicate is a functional interface which takes 1 input returns true or false
        Predicate<Integer> predicate = i ->  i % 2 == 0;

        data.stream()
                .filter(predicate)
                .forEach(System.out::println);

        System.out.println("---------");

    }

    private static void supplierExample(List<Integer> data) {
        //Supplier is a functional interface which takes nothing but returns something
        Supplier<LocalDateTime> localDateTimeSupplier = LocalDateTime::now;

        data.stream()
                .map(i -> "i = "+ i +" @ "+ localDateTimeSupplier.get())
                .forEach(System.out::println);

        System.out.println("---------");
        System.out.println(localDateTimeSupplier.get());
        System.out.println("---------");
    }

}
