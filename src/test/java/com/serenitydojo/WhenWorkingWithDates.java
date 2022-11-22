package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithDates {

    @Test
    public void creatingTimeStampFortToday(){
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
    }

    @Test
    public void createGivenDate(){
        LocalDate fourthOfJuly = LocalDate.of(2022, 7,4);
        System.out.println(fourthOfJuly);
    }

    @Test
    public void parsingADate(){
        String dateInStringForm = "2022-05-01";
        LocalDate firstOfMay = LocalDate.parse(dateInStringForm);
        System.out.println(firstOfMay);
    }

    @Test
    public void parsingADateWithAGivenFormat(){

        LocalDate mayFirst = LocalDate.parse("05/01/2022", DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        System.out.println(mayFirst);
    }

    @Test
    public void yesterday(){
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        System.out.println(yesterday);

    }

    @Test
    public void yesterdayCenturyAgo(){
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minus(1, ChronoUnit.CENTURIES);

        System.out.println(yesterday);

    }

    @Test
    public void checkingTheMonth(){
        LocalDate today = LocalDate.now();

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());

    }
    @Test
    public void comparingDates(){
        LocalDate firstOfMay = LocalDate.of(202, 5, 1);
        LocalDate fifthOfMay = LocalDate.of(202, 5, 5);
        LocalDate tenthOfMay = LocalDate.of(202, 5, 10);

        assertThat(firstOfMay).isBefore(fifthOfMay);
       // assertThat(firstOfMay).isAfter(fifthOfMay);
        assertThat(fifthOfMay).isBetween(firstOfMay, fifthOfMay);
    }

    @Test
    public void usingTimes(){

        LocalTime now = LocalTime.now();
        LocalTime fiveHoursAgo = now.minus(5, ChronoUnit.HOURS);
        System.out.println(fiveHoursAgo);

       assertThat(fiveHoursAgo).isEqualTo(15);

    }


}