package org.example;

public class BankAccount {

    private double balance=0;


    public void deposit(double amount){

        balance = balance + amount;

    }
    public void withdraw(double amount){

        if(amount>balance){
            System.out.println("Insufficient Fund!");
        }
        else {
            balance = balance - amount;
        }
    }

    public void showBalance(){

        System.out.println("Your balance is: "+ this.balance);
    }
}
