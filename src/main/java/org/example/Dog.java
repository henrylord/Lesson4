package org.example;

public class Dog extends Animal {

    public void bark(int time) {
        for (int i=0; i < time; i++) {
            System.out.println("Woof!");
        }
    }
}
