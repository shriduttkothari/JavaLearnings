package org.shridutt.datatimeapi;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

public class ClockExample {

    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        Instant instant = clock.instant();
        System.out.println("instant: " + instant);

        Clock clock2 = Clock.systemDefaultZone();
        Instant instant2 = clock2.instant();
        System.out.println("instant2: " + instant2);




    }
}
