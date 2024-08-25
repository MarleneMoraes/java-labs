package com.testsoft.mortgagecalculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MortgageCalculatorTest {

    @Test
    public void testCalculateMortgageYoungFemale() {
        MortgageCalculator calculator = new MortgageCalculator(true);
        double result = calculator.calculateMortgage(25, 5000);
        assertEquals(350000, result, 0.01);
    }

    @Test
    public void testCalculateMortgageYoungMale() {
        MortgageCalculator calculator = new MortgageCalculator(false);
        double result = calculator.calculateMortgage(25, 5000);
        assertEquals(375000, result, 0.01);
    }

    @Test
    public void testCalculateMortgageMediumFemale() {
        MortgageCalculator calculator = new MortgageCalculator(true);
        double result = calculator.calculateMortgage(35, 5000);
        assertEquals(250000, result, 0.01);
    }

    @Test
    public void testCalculateMortgageMediumMale() {
        MortgageCalculator calculator = new MortgageCalculator(false);
        double result = calculator.calculateMortgage(40, 5000);
        assertEquals(275000, result, 0.01);
    }

    @Test
    public void testCalculateMortgageOldFemale() {
        MortgageCalculator calculator = new MortgageCalculator(true);
        double result = calculator.calculateMortgage(45, 5000);
        assertEquals(175000, result, 0.01);
    }

    @Test
    public void testCalculateMortgageOldMale() {
        MortgageCalculator calculator = new MortgageCalculator(false);
        double result = calculator.calculateMortgage(50, 5000);
        assertEquals(150000, result, 0.01);
    }
}
