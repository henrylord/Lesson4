package org.example;

import java.text.DecimalFormat;

public class BankAccount {

    private double savingAmount =0;
    private double rate;



    public void deposit(double amount){

        savingAmount = savingAmount + amount;

    }
    public void withdraw(double amount){

        if(amount>savingAmount){
            System.out.println("Insufficient Fund!");
        }
        else {
            savingAmount = savingAmount - amount;
        }
    }

    public void showSaving(){

        System.out.println("Your Saving Account has: $"+ this.savingAmount + "Dollar");
    }

    public String interestRate(double principal, double interestPaid, int time){

         rate = interestPaid / (principal * time) *100;
         DecimalFormat n = new DecimalFormat("#.##");
         return n.format(rate);

    }

}
