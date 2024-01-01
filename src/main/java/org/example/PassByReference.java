package org.example;

public class PassByReference {

    int x;
    int y;


    PassByReference(int x, int y){

        this.x=x;
        this.y=y;
    }

     static void doubleValue(PassByReference a) {

        a.x =200;

    }

public static void main(String[] args) {

    PassByReference obj1 = new PassByReference(20, 50);

    System.out.println(obj1.x);

    doubleValue(obj1);

    System.out.println(obj1.x);

    }
}