package org.example;

public class Student {

        String name;
        int age;
        String course;

        public void studentUpdate(String name, int age, String course){

            this.name = name;
            this.age = age;
            this.course = course;

        }

        public void displayStudent(){

            System.out.println("Student Name: "+ this.name );
            System.out.println("Student Age: "+ this.age);
            System.out.println("Student Course: "+ this.course);
        }

}
