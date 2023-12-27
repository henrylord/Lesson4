package org.example;

public class Calculator {

    public double addition( double x, double y){

        return x+y;

    }

    public double addition(double x,double y,double z){

        return x+y+z;

    }

    public double substraction(double x, double y){

        return x-y;
    }

    public int substraction(int x,int y){

        return x-y;
    }

    public double multiplication(double x, double y){

        return x*y;
    }

    public double division(double x, double y){

        return x/y;
    }

    static boolean isPrime (int num){

        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;

    }
}
