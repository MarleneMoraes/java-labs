package com.testsoft.mortgagecalculation;

public class MortgageCalculator {
    private boolean isFemale;

    public MortgageCalculator(boolean isFemale) {
        this.isFemale = isFemale;
    }

    public double calculateMortgage(int age, double salary) {
        double factor = getFactor(age);
        return salary * factor;
    }

    private double getFactor(int age) {
        if (isYoung(age))
            return isFemale ? 70 : 75;
        else if (isMedium(age))
            return isFemale ? 50 : 55;
        else if (isOld(age))
            return isFemale ? 35 : 30;
        return age;
    }

    private boolean isYoung(int age) {
        return (isFemale && age >= 18 && age <= 30)
                || (!isFemale && age >= 18 && age <= 35);
    }

    private boolean isMedium(int age) {
        return (isFemale && age >= 31 && age <= 40) 
                || (!isFemale && age >= 36 && age <= 45);
    }

    private boolean isOld(int age) {
        return (isFemale && age >= 41 && age <= 50) 
                || (!isFemale && age >= 46 && age <= 55);
    }
}