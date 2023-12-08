package org.example;

public class Rectangle {

    private double width,height;
    double p,a;


    public void rectangleUpdate(double width, double height){

        this.width = width;
        this.height = height;
        System.out.println("Rectangle Width = "+ this.width);
        System.out.println("Rectangle Height = "+ this.height);
    }
    public double perimeter(){

        p = 2*(height+width);
        return p;
    }

    public double area(){

        a = height*width;
        return a;
    }
}
