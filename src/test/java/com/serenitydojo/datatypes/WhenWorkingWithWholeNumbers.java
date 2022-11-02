package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {

    @Test
    public void addingNumbersTogether(){

        int initialTear = 1985;
        int targetYear = 0;
        int timeJump = 30;
        targetYear = initialTear + timeJump;

        assertThat(targetYear, equalTo(2015));


    }






}
