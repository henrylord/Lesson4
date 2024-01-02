package org.example;

public class Box {

    private double width, length, height;

    //private int num = 5;
    int num = 5;
    double volume;

    Box() {
        width = length = height = 0;
        volume = 0;
        System.out.println("You called default constructor.Here is a box with zero dimensions!");
    }

    Box(double sideLength) {
        //this();
        width = length = height = sideLength;
        volume = width * length * height;
        System.out.println("Here is a cube with side length: " + sideLength);
    }

    Box(double width, double length, double height) {
        //this(10);
        this.width = width;
        this.length = length;
        this.height = height;
        volume = this.width * this.length * this.height;
        System.out.println("Your have a customized box!\n" + "width=" + this.width + "\n" + "length=" + this.length + "\n" + "height=" + this.height);
    }

    public void shrinkBoxByFactor(Box obj, int factor) {
        this.height = obj.height / factor;
        this.length = obj.length / factor;
        this.width = obj.width / factor;

        System.out.println("Ops! Your box has been shrank!\n" + "width=" + this.width + "\n" + "length=" + this.length + "\n" + "height=" + this.height);
    }

    public Box compareBox(Box obj1, Box obj2) {

        if (obj1.volume > obj2.volume) {
            return obj1;
        } else if (obj1.volume < obj2.volume) {
            return obj2;
        } else
            return obj1;
    }


    public int getNum() {

        return num;
    }

    public int setNum(int x) {

        num = x;
        return num;
    }


    public Box createAndReturnObjects (){

        Box obj1 = new Box();

        return obj1;

    }

    public static void main(String[] args) {

        // Box myObj = new Box();
        // Box myObj = new Box(5);
        // Box myObj = new Box(5,6,80);
        // myObj.shrinkBoxByFactor(myObj,5);

        Box box1 = new Box(1, 100, 100);
        Box box2 = new Box(1, 100, 100);

        Box temp = new Box();
        if (temp.compareBox(box1, box2).equals(box1)) {

            System.out.println("The largest volume is Box1");
        } else if (temp.compareBox(box1, box2).equals(box2)) {

            System.out.println("The largest volume is Box2");
        }

    }
}

//Constructor Overloading allows for object initialization with different initial states.
//Reduces code duplication
//Increases code readability