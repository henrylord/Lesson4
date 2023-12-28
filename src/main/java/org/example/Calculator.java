package org.example;

public class Calculator {

    //addition() method overloading by changing the number of parameters.
    static int addition(int x, int y, int z){

        return x+y+z;
    }

    static int addition(int x, int y){

        return x+y;
    }

    public double addition( double x, double y){

        return x+y;

    }

    //addition() method overloading by changing the type of parameters.
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

    public int multiplication(int x, int y, int z){

        return x*y*z;
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


    public static void main(String[] args) {

        System.out.println(addition(5, 6));
        System.out.println(addition(1, 2, 3));

        Calculator myObj = new Calculator();
        System.out.println(myObj.addition(5.6,4.4,2.5));
        System.out.println(myObj.addition(5.6, 4.4));
        System.out.println(myObj.multiplication(5.5,10));
        System.out.println(myObj.multiplication(10, 5, 1));

    }

}
