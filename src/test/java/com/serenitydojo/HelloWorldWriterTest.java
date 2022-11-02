package com.serenitydojo;

import org.junit.Test;



public class HelloWorldWriterTest {



    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writehelloWorld();

    }

    @Test
    public void declaringNumericValuables(){
        int ageThisYear = 42;
        Integer number = 22;
        int ageNextYear = ageThisYear + 1;

        long starsInTheGalaxy = 1000000000000L;

        //float weight = 15.5F;
        double weight = 15.5;

        System.out.println("age = " + ageNextYear);
    }

    @Test
    public void workingWithStrings(){

        String firstName = " Sarah-Jane";

        String upperCaseFirstName = firstName.toUpperCase();
        System.out.println(upperCaseFirstName);

        String replacedFirstName = firstName.replace("Sarah", "Mary");
        System.out.println(replacedFirstName);


    }





}
