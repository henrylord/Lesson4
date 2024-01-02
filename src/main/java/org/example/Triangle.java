package org.example;

public class Triangle {

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double area;
    private double perimeter;

    Triangle(double base, double height, double side1, double side2){

        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
    }

    Triangle areaOfTriangle(){

        area = this.base * this.height / 2;

        return this;
    }

    Triangle primeterOfTriangle(){

        perimeter = this.base + this.side2 +this.side1;

        return this;
    }

    void displayTriangle(){

        System.out.println("The area of triangle: "+ area + "\nThe perimeter of triangle: "+ perimeter);

    }


    public static void main(String[] args) {

        Triangle obj1 = new Triangle(10,5,8,2);

        obj1.areaOfTriangle().primeterOfTriangle().displayTriangle();


    }



}
