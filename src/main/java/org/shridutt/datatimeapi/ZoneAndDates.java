package org.shridutt.datatimeapi;

import java.time.*;

public class ZoneAndDates {


    public static void main(String[] args) {

        ZonedDateTime zdt1 = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of(ZoneId.SHORT_IDS.get("IST")));
        System.out.println("zdt1: "+zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Asia/Kolkata"));
        System.out.println("zdt2: "+ zdt2);

        LocalDateTime localDateTime = LocalDateTime.now();



        System.out.println("localDateTime: "+ localDateTime);
        ZonedDateTime zdt3 = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Kolkata"));


        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.of(ZoneId.SHORT_IDS.get("IST")));
        System.out.println("localDateTime2: "+ localDateTime2);

        ZonedDateTime zdt5 = ZonedDateTime.of(localDateTime2, ZoneId.of("Asia/Kolkata"));
        System.out.println("zdt3: "+ zdt3);

        ZonedDateTime zdt4 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Kolkata"));
        System.out.println("zdt4: "+ zdt4);


        ZonedDateTime zdt6 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Amsterdam"));
        System.out.println("zdt6: "+ zdt6);

        ZonedDateTime zdt7 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Berlin"));
        System.out.println("zdt7: "+ zdt7);


    }
}
