package org.shridutt.datatimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        String formattedDate = dateTimeFormatter.format(now);

        System.out.println("formattedDate: "+ formattedDate);
    }
}
