package org.example;

public class Box {

    private double width, length, height;

    Box(){
        width = length = height = 0;
        System.out.println("You called default constructor.Here is a box with zero dimensions!");
    }

    Box(double sideLength){
        this();
        width = length = height = sideLength;
        System.out.println("Here is a cube with side length: "+ sideLength);
    }

    Box(double width, double length, double height){
        this(10);
        this.width=width;
        this.length=length;
        this.height=height;
        System.out.println("Your have a customized box!\n"+ "width="+width+"\n"+"length="+length+"\n"+"height="+height);
    }

    public static void main(String[] args) {

       // Box myObj = new Box();
       // Box myObj = new Box(5);
          Box myObj = new Box(5,6,80);

    }

}

//Constructor Overloading allows for object initialization with different initial states.
//Reduces code duplication
//Increases code readability