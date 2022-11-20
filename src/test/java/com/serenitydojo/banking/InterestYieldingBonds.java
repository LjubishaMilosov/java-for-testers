package com.serenitydojo.banking;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class InterestYieldingBonds implements InterestBearing {

    private double value;
    private double interestRate;

    public InterestYieldingBonds(double value, double interestRate) {
        this.value = value;
        this.interestRate = interestRate;
    }

    @Override
    public double calculateMonthlyInterest(){
        return value * interestRate / 12;
    }


}
