package org.example;

public class PassByValue {

    int num;


    PassByValue(int a){

        this.num = a;
    }

    public void doubleValue(int a){

        a = a *2;

    }

    public static void main(String[] args) {

        PassByValue test1 = new PassByValue(200);

        test1.doubleValue(test1.num);

        System.out.println(test1.num);
    }

}
