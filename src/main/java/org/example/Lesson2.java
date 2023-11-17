package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lesson2 {

    // Declare two `int` variables and find their sum and product.
    /*public static void main(String[] args) {

        int a=10;
        int b=100;
        int c=a+b;
        System.out.println("The sum is:" + c);


    }
} */


    //Create variables to store your name and age, then display them.
   /* public static void main(String[] args) {

        String name = "henry hong";
        int age = 40;

        System.out.println("My name:" + name + "\n" + "Age:" + age);


    }

}*/


    // Declare a `float` variable and assign it a decimal value, then round this value to the nearest whole number.

    /*public static void main(String[] args) {

        double f = 4.565656;

        System.out.println("The rounded value:" + (int)(f));


    }
}*/


    //Create two `char` variables, assign values to them, and find their sum.

    /*public static void main(String[] args) {

    char a ='H';
    char b ='i';

    System.out.println(a+b);

    }
}*/


    //Declare a `String` variable and convert it into a character array.

   /* public static void main(String[] args) {

        String a = "henry";

        char[] ch = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }

        // Printing the elements of array
        // using for each loop
        for (char c : ch) {
            System.out.println(c);



        }
    }

    }*/


    //Create two boolean variables, compare them, and display the result.

    /*public static void main(String[] args) {

        boolean a = 3>5;
        boolean b = true;

        System.out.println(a);
        System.out.println(b);
    }

    }*/


    //Use variables to calculate the perimeter of a rectangle.

    /*public static void main(String[] args) {

        double l = 4.678;
        double w = 56.3252344;
        double p = 2 * (l + w);
        System.out.println("The perimeter of a rectangle = " + p);


    }
}*/


    //Create a variable to store the number PI and display it rounded to 3 decimal places.

    /*public static void main(String[] args) {

        double a = Math.PI;

        System.out.format("PI Rounded 2 decimal = %.2f", a);


    }
}*/


    //Declare a variable without assigning a value and try to display it. What error arises?

    /*public static void main(String[] args) {

        int a;

        System.out.println(a);

        }

    } // Answer: java: variable a might not have been initialized*/


    //Declare two string-type variables. Check if you can add them, and if so, display the result of the addition.

    /*public static void main(String[] args) {

        String a = "abcd";

        String b = "efgh;";

        System.out.println(a+b);
    }

}*/


//Arrays

//Create an array of 10 integers and find their sum


   /* public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i <arr.length; i++){
            sum = sum + arr[i];
            sum +=arr[i];
        }

        System.out.println("The sum of the array = " + sum);

    }

}*/


// Declare an array of 5 strings and display the third string.


    /*public static void main(String[] args) {

        String[] str = {"henry", "lina", "angela", "tom", "bob"};

        System.out.println(str[2]);

    }
}*/


// Find the largest element in an array of 7 floating-point numbers.

    /*public static void main(String[] args) {

        double[] f = {2.34, 45.45678, 67.4545, 3243243.56, 45678.4567, 435.45667889, 69678.34234};
        double max = f[0];
        for (int i = 0; i < f.length; i++) {

            if (max < f[i]) {

                max = f[i];
            }

        }
        System.out.println(max);
    }
}*/

    //Write code to reverse an array of 8 elements.

//    public static void main(String[] args) {
//
//        String[] str = {"henry", "lina", "angela", "tom", "bob"};
//
//        String[] reverse_str = new String[str.length];
//        int y = 0;
//        for (int i = str.length - 1; i > 0; i--) {
//            reverse_str[y] = str[i];
//            y = y + 1;
//        }
//        for (String a : reverse_str) {
//            System.out.println(a);
//        }
    //Create a 5x5 two-dimensional array and fill it with numbers from 1 to 25.

   /* public static void main(String[] args) {

        int[][] arr = new int [5][5];

        Random n = new Random();

        int upperbound = 26;

        for (int i=0; i < arr.length; i++){

            for (int j=0; j<arr[i].length; j++){

                int int_random = n.nextInt(upperbound);
                arr[i][j] = int_random;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}*/


// Display all even numbers from an integer array.

    /*public static void main(String[] args) {

    int [] arr = new int[100];

    Random n = new Random();

    int upperbound = 101;

    for (int i=0; i< arr.length; i++) {

        int int_random = n.nextInt(upperbound);

        arr[i] = int_random;

        if (arr[i] % 2 == 0)
            continue;

        else
            System.out.println(arr[i]);
        }
    }

}*/


// Create an array of strings and concatenate all strings into one using the "-" delimiter.

    /*public static void main(String[] args) {

        String[] str = {"Henry", "Lina", "Angela", "are", "family"};

        String myFamily = String.join("-", str);

        System.out.println(myFamily);
    }
}*/


// Find and display the length of a string array.

    /*public static void main(String[] args) {

        String[] str = {"Henry", "Lina", "Angela", "are", "family"};

        System.out.println(str.length);

    }
}*/


// Write a program that checks if an array contains a specified value.


   /* public static void main(String[] args) {

        String[] str = {"Henry", "Lina", "Angela", "are", "family"};

        for (String a : str) {
            if (a == "family") {
                System.out.println("we found it:" + a);
            } else {
                continue;
            }
        }

    }
}*/

// Create an array and perform its shallow and deep copy. Explain the difference


    /*public static void main(String[] args) {

        String[] str = {"Henry", "Lina", "Angela", "are", "family"};

        String[] s_cloned_str = str.clone();//deep copy

        // String[] d_cloned_str = SerializationUtils.clone(str);

        str[0] = "Tom";

        for (String a : str) {
            System.out.print(a + " ");

        }
        System.out.println();

        for (String b : s_cloned_str) {
            System.out.print(b + " ");
        }

    }

}*/


// Loops
// Display all numbers from 1 to 50.

    /*public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

    }
}*/


// Write a program that displays the squares of numbers from 1 to 15.

   /* public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.println(i * i);
        }

    }
}*/

// Find the sum of all numbers from 50 to 100.

   /* public static void main(String[] args) {
        int sum = 0;
        for (int i = 50; i <= 100; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }
}*/


// Display all prime numbers from 1 to 100.

   /* public static void main(String[] args) {

        for (int i=1; i<=100; i++){

            if (i=1){
                continue;
            }
            int m = i/2;
            if ()




    */


// Create a loop that displays numbers from 100 to 1


   /* public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {

            System.out.println(i);
        }
    }
}*/


// Write a program that displays all Fibonacci numbers less than 1000.

    /*public static void main(String[] args) {

        int n1=0, n2=1;

        int n3;


        for (int i=1; i<=1000; i++){

            System.out.println(n1);

            n3 = n1 +n2;

            n1 = n2;

            n2 = n3;

            if (n1 >1000) break;

        }
    }
}*/


// Using a loop, find the factorial of the number 7

    /*public static void main(String[] args) {

        int f = 1;

        for (int i = 7; i > 1; i--) {

            f = f * i;
        }

        System.out.println(f);
    }

}*/


// Write a loop that displays the multiplication table for the number 7

   /* public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            int p = 7 * i;

            System.out.println(7 + "x" + i + "=" + p);
        }
    }
}*/


// . Create a nested loop to display the following pyramid of numbers:

   /* public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

// Using a loop, display every second letter from a given string


    /*static void myMethod(String s) {

        for (int i=0; i<s.length();){

            System.out.println(s.charAt(i));

            i=i+2;
        }

    }

    public static void main(String[] args) {

        myMethod("hongheyangatlogix");

    }
}*/


// Create a nested loop to display the following pyramid of numbers ??

    /*public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }

    }
}*/


//Conditional Statements

//Check if a number is even or odd.

    /*static void numCheck(int a) {

        if (a % 2 == 0) {

            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }


    public static void main(String[] args) {

        numCheck(67687679);
    }
}*/


// Determine in which quadrant of the coordinate plane a point with specified coordinates falls


    /*static void quaFinder(double x, double y) {

        if (x>0 & y>0){
            System.out.println("Quadrant I");
        }
        else if (x<0 & y>0){
            System.out.println("Quadrant II");
        }
        else if (x<0 & y<0){
            System.out.println("Quadrant III");
        }
        else{
            System.out.println("Quadrant IV");
        }

    }

    public static void main(String[] args) {

        quaFinder(5.678, -43.345);
    }
}*/


// Write a program that checks if a number is simultaneously a divisor of 3, 5, and 7

   /* static void divisorCheck(double a) {

        if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {

            System.out.println("yes");
        }
        else
            System.out.println("no");
    }

    public static void main(String[] args) {

        divisorCheck(4567);
        divisorCheck(105);

    }
}*/


// Determine whether the entered number is positive, negative, or zero.

    /*static void numCheck(double a) {

        if (a > 0) {
            System.out.println("positive");
        } else if (a < 0) {
            System.out.println("negative");
        } else
            System.out.println("zero");
    }

    public static void main(String[] args) {
        numCheck(-12321.434);
        numCheck(5598695);
        numCheck(0);
    }
}*/


// Check if a student can receive a scholarship. Scholarships are given to students with an average grade above 4.5.

    /*static void scholarshipCheck(double grade1, double grade2, double grade3) {
        double average = (grade1 + grade2 + grade3) / 3;
        if (average > 4.5) {
            System.out.println("You will receive scholarship");
        } else {
            System.out.println("no scholarship for you");
        }
    }

    public static void main(String[] args) {
        scholarshipCheck(2.5, 5, 4);
        scholarshipCheck(1.5,5,0);
        scholarshipCheck(5,5,4);
    }
}*/

//Determine the season based on a given month.

    /*static void seasonCheck(String month) {


        if (month.equals("January") || month.equals("February")  || month.equals("March")  || month.equals("November")  || month.equals("December") ) {
            System.out.println("winter");
        }
        else if (month.equals("July") || month.equals("August")){
            System.out.println("Summer");
        }
        else if (month.equals("September") || month.equals("October")){
            System.out.println("Fall");
        }
        else if (month.equals("April") || month.equals("May") || month.equals("June")){
            System.out.println("Spring");
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the month in letter with first letter capital:");

        String userInput = myObj.nextLine();

        seasonCheck(userInput);

    }
}*/


// Write a program that determines if the entered number is two-digit

  /*  static void digitCheck(int a) {

        String b = String.valueOf(a);

        if (b.length() == 2) {

            System.out.println("This is two-digit number");
        }
        else{
            System.out.println("not two-digit number");
        }

    }

    public static void main(String[] args) {
        digitCheck(45);
        digitCheck(2);
        digitCheck(200);
    }
}*/


// Check three numbers and determine which one is the largest.

    /*static double largest_num(double n1, double n2, double n3) {

        double[] arr = new double[3];

        arr[0] = n1;
        arr[1] = n2;
        arr[2] = n3;

        double maxNum = arr[0];

        for (int i=0; i<arr.length; i++){

            if (arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;

}
    public static void main(String[] args) {

        double firstNum = 0,secondNum = 0,thirdNum = 0;
        boolean validInput1 = true, validInput2 = true, validInput3 = true;

        Scanner myObj = new Scanner(System.in);

        while(validInput1){

            System.out.println("Please enter first number:");
            String firstNumString = myObj.nextLine();
            try {
                firstNum = Double.parseDouble(firstNumString);
                validInput1 = false;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input");

            }
        }

        while(validInput2) {
            System.out.println("Please enter the second number:");
            String secondNumString = myObj.nextLine();
            try {
                secondNum = Double.parseDouble(secondNumString);
                validInput2 = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        while(validInput3) {
            System.out.println("Please enter the third number:");
            String thirdNumString = myObj.nextLine();
            try {
                thirdNum = Double.parseDouble(thirdNumString);
                validInput3 = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }


        System.out.println("The largest number is: " + largest_num(firstNum, secondNum, thirdNum));

    }
}*/

//Write code that checks if all numbers in an array are positive.

    /*public static void main(String[] args) {

        double[] arr = {1, 52, 70, 6, 8,0};

        double product = 1;

        for (int num = 0; num < arr.length; num++) {

            product = product * arr[num];
        }

        if (product > 0) {
            System.out.println("All numbers are positive");
        } else {
            System.out.println("Negative or zero number found");
        }
    }
}*/


// Create a program that determines whether the entered year is a leap year

    static void leapYearCheck (int year){

        if (year%4==0){

            System.out.println("This is leap year");
        }
        else {
            System.out.println("Not leap year");
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the year:");

        String userYear = myObj.nextLine();

        int year = Integer.parseInt(userYear);

        leapYearCheck(year);

    }
}



