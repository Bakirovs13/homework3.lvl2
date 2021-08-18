package com.company;

public class LimitException extends Exception{   //класс
     private final double remainingAmount;

    public LimitException(String message, double remainingAmount) {   //с конструктором LimitException(String message, double remainingAmount
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {   //метод getRemainingAmount()
        return remainingAmount;
    }
}
