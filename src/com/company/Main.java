package com.company;

public class Main {

    public static void main(String[] args) {


        BankAccount ClientbankAccount = new BankAccount(); // создавался счет клиента

        ClientbankAccount.deposit( 20000); // Положить 20 000 сом на счет

        while (true) {  //снять через бесконечный цикл, каждую итерацию по 6000 сом

            try{
                System.out.println("available amount of money : " + ClientbankAccount.getAmount());
                ClientbankAccount.withDraw(6000);
                System.out.println("withdraw 6000 som");

            } catch (LimitException limitExeption) {
                System.out.println("withdraw 6000 som"+limitExeption.getRemainingAmount()+limitExeption.getMessage());

                try {
                    ClientbankAccount.withDraw(ClientbankAccount.getAmount());
                } catch (LimitException exeption) {
                    exeption.printStackTrace();
                }
                System.out.println(ClientbankAccount.getAmount());
                break;

            }

        }}
}
