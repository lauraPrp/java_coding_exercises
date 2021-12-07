package com.techreturners.exercise004;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exercise004 {

    LocalDateTime ldLater;
    public static  long gigasec= 1_000_000_000L;

    public Exercise004(LocalDate date) {
        LocalTime lt = LocalTime.of(0,0,0);
        ldLater = LocalDateTime.of(date,lt).plus(gigasec, ChronoUnit.SECONDS);
    }

    public Exercise004(LocalDateTime dateTime) {
         ldLater = dateTime.plus(gigasec, ChronoUnit.SECONDS) ;
    }

    public LocalDateTime getDateTime() {
    return   ldLater;
    }
}
