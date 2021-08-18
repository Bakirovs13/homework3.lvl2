package com.company;

public class BankAccount {
    private double amount;   // -остаток на счете

    public double getAmount() {   //возвращает текущий остаток
        return amount;

    }

    public void deposit(double putmoney){  //положить деньги на счет
        amount = amount + putmoney;
    }

    public void withDraw(double withdrawmoney) throws LimitException   //снимает указанную сумму со счета
    {
        if (withdrawmoney > amount) {
            throw new LimitException("\nthe requested amount should not exceed the amount of money in the account " + "\navailable amount :" + amount, withdrawmoney);
        } else {

            amount = amount - withdrawmoney;

        }

    }


    //может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем остаток денег на счете.




}
