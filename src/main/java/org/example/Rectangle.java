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

    public int rectangleCompare(double width1,double height1,double width2,double height2){

        double area1 = width1 * height1;

        double area2 = width2 * height2;

        if (area1 > area2){return 1;}
        else if (area1 < area2){return 2;}
        else {return 0;}
    }
}
