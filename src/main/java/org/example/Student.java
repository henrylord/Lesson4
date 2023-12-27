package org.example;

import java.util.ArrayList;

public class Student {

        String name;
        int age;
        String course;
        ArrayList<Double> score = new ArrayList<Double>();
        double averageScore;
        private double totalScore =0;

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

        public void addScore(double score){

            this.score.add(score);
        }

        public double averageScore(){

            for (double i: score){

                totalScore +=i;
            }
            return averageScore = totalScore/score.size();
        }
}

