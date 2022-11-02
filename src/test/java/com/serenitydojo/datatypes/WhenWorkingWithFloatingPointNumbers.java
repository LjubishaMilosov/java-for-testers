package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {


    @Test
    public void convertingANumberFromCelciusToFrenheit(){

        double temperatureInCelsius = 15.0;

        double temperatureInFarenheit = (temperatureInCelsius * 1.8) + 32;

        System.out.println("Temperature in Farenheit is: " + temperatureInFarenheit);

    }

    @Test
    public void convertingKilogramsToPounds() {

        double weightInKilograms = 85.6;

        double weightInPounds = weightInKilograms * 2.20462262;

        System.out.println("Weight in pounds is: " + weightInPounds);






    }


    }
