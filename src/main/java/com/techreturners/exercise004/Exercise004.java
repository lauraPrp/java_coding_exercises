package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercise004 {

    LocalDateTime ldLater;
    public static final long gigasec= 1_000_000_000L;

    public LocalDate parseStrToLocalDate(String strToParse){
        if(strToParse.length()!=8)
            throw new IllegalArgumentException("Date not valid check input: it should be YYYYMMDD");
        LocalDate date= LocalDate.parse(strToParse, DateTimeFormatter.BASIC_ISO_DATE);

       return date;
    }


    public Exercise004(String dateString) {
        LocalDate date= parseStrToLocalDate(dateString);
        LocalTime lt = LocalTime.of(0,0,0);
        ldLater = LocalDateTime.of(date,lt).plus(gigasec, ChronoUnit.SECONDS);

    }

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
