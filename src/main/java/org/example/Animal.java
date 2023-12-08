package org.example;

public class Animal {

    private String name;
    private String type;
    private int age;


    public void eat(){

        System.out.println("I am eating");
    }

    public void animalName(String n){
        this.name = n;
        System.out.println("My name is " + name);
    }

    public void animalType(String t){
        this.type = t;
        System.out.println("I am a " + type);
    }

    public void animalAge(int a){
        this.age = a;
        System.out.println("I am "+ age + " years old");
    }
}
