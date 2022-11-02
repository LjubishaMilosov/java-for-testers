package com.serenitydojo.datatypes;

import org.junit.Test;

public class WhenWorkingWithStrings {

    @Test
    public void ConvertingToLowerCase(){

    String lowerCaseFullName = "Ljubisha Milosov";
    String upperCaseFullName = lowerCaseFullName.toUpperCase();

    System.out.println(upperCaseFullName);

    }

    @Test
    public void ConvertingToUpperCase(){

        String upperCaseFullName = "LJUBISHA MILOSOV";
        String lowerCaseFullName = upperCaseFullName.toLowerCase();

        System.out.println(lowerCaseFullName);

    }

    @Test
    public void trimmingExtraSpace(){

        String fullName = "            Ljubisha Milosov";
        String extraSpaceTrimmed = fullName.trim();

        System.out.println(fullName);
        System.out.println(extraSpaceTrimmed);
    }

    @Test
    public void findingLengthOfString(){

        String fullName = "Ljubisha Milosov";
        int lengthOfString = fullName.length();

        System.out.println(lengthOfString);

    }

    @Test
    public void replacingTextInString(){

        String fullName = "Ljubisha Milosov";
        String replacedFirstName = fullName.replace("Ljubisha", "Dimitar");

        System.out.println(replacedFirstName);

    }
}
