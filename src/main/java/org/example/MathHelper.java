package org.example;

public class MathHelper {

    static int maxNumber(int[] arr){

        int max = arr[0];

        for (int i=1; i<arr.length; i++){

            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

public static void main(String[] args) {

        int myArr[] = {45, 67, 89, 21, 34, 56, 67};

        System.out.println("The largest number is: " + maxNumber(myArr));


    }
}