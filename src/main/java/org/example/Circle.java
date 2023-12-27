package org.example;

public class Circle {

    double diameter;
    public double circleDiameter(double radius){

        diameter = 2*radius;

        return diameter;

    }
    public static void main(String[] args) {

        Circle myObj = new Circle();

        System.out.println("The circle diameter is: "+ myObj.circleDiameter(Double.parseDouble(args[0]))); ;

    }

}
