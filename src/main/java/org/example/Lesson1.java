package org.example;

public class Lesson1 {
    public static void main(String[] args) {

        int y = 0;
        String name = "hongheyang";
        double decimal = 2.89898989;

//        double[] n = new double[10];
//
//        int[] m = new int[20];
//
        char[] f = {'3', 'r', 't', 'u', 'o', 'p'};
//
//        System.out.println(f[2]);
//
//        if (f[0] == '3') {
//            System.out.println("you are correct");
//        } else if (f[2] == 't') {
//            System.out.println(decimal);
//        } else
//            System.out.println(f[1]);

//        for (variable;conditions; increments/decrement --){
        for (; y < 6; y++) {
            System.out.println(f[y]);

            while (y < 2){
                System.out.println("i got in while loop" + y + "time");
                y++;
            }
            do {
                System.out.println("hahahaha");
                y++;

            } while(y < 5);
            System.out.println("xixixi");

        }






    }
}