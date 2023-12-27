package org.example;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Callable;

import javax.imageio.plugins.bmp.BMPImageWriteParam;




public class Lesson3 {

// ### 1. Introduction to Object-Oriented Programming
// Describe how encapsulation helps protect data in a program.

    /*To make sure that "sensitive" data is hidden from users. To achieve this, you must:

    - declare class variables/attributes as private
    - provide public get and set methods to access and update the value of a private variable
    - Better control of class attributes and methods
    - Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    - Flexible: the programmer can change one part of the code without affecting other parts
    - Increased security of data */

/*********************************************************************************/

    // Write a short report on how inheritance simplifies code reuse.

    /*- reuse attributes and methods of an existing class when you create a new class.*/

/*********************************************************************************/

// Provide a real-life example of polymorphism and explain how it relates to OOP.

    //- Subclass can overwrite super class method with same method name. when creating object from subclass and call
    // its methods, it uses the same method name but output in a different form.

   /* class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }*/


    /*************************************************************************************/


// Create a diagram showing the relationships between classes and objects.

//   Class                   Objects

//    Car                     VW
//                            BMW
//                            Nissan
//                            Toyota
//
// When the individual objects are created, they inherit all the variables and methods from the class.

    /**********************************************************************************************************/

// Explain the difference between a class and an object in your own words.

    // a class is a template for its objects, and an object is an instance of a class.


// Write an essay on the importance of OOP in modern programming.

// Create a presentation explaining the basic principles of OOP.

// Discuss how OOP facilitates the creation of modular and scalable code.

// Provide examples where OOP might not be the best choice for a project.

// Compare OOP with procedural programming using an example.


//### 2. Classes in Java
//Create an `Animal` class with various fields and methods.
    /*public static void main(String[] args) {


        Fish shark = new Fish();
        Bird parrot = new Bird();
        Dog golden = new Dog();

        shark.eat();
        shark.swim();
        shark.animalAge(15);
        shark.animalType("fish");

        parrot.animalType("bird");
        parrot.eat();
        parrot.fly();
        parrot.animalName("Tom");

        golden.bark(10);
        golden.eat();
        golden.animalAge(2);
        golden.animalType("dog");
    }
}*/


//Write a `Book` class with fields for title, author, and year of publication, and methods to access these fields
   /* public static void main(String[] args) {

        Book myObj = new Book();

        System.out.println(myObj.getAuthor());
        System.out.println(myObj.getTitle());
        System.out.println(myObj.getYearOfPublication());

        myObj.setAuthor("Henry Hong");
        System.out.println(myObj.getAuthor());

    }
}*/


//Develop a `Calculator` class with methods for basic mathematical operations.
    /*public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);
        System.out.println("Please enter first number:");
        String firstNum = myObject.nextLine();
        double f = Double.parseDouble(firstNum);

        System.out.println("Please enter second number:");
        String secondNum = myObject.nextLine();
        double s = Double.parseDouble(secondNum);

        System.out.println("PLease choose type of operation from (+,-,*,/)");
        String operator = myObject.nextLine();

        Calculator calObject = new Calculator();

        switch (operator){

            case "+":
                System.out.println("Your answer is:" + calObject.addition(f,s));
                break;

            case "-":
                System.out.println("Your answer is:" + calObject.substraction(f,s));
                break;

            case "*":
                System.out.println("Your answer is:" + calObject.multiplication(f,s));
                break;

            case "/":
                System.out.println("Your answer is:" + calObject.division(f,s));
                break;

        }
    }
}*/


// Create a `Student` class with fields for name, age, and course, and methods to set and get this data.
   /* public static void main(String[] args) {

        Student myObj = new Student();

        myObj.studentUpdate("Henry", 40, "QA Automation");

        myObj.displayStudent();

    }
}*/


// Write a `TemperatureConverter` class with methods to convert temperature between Celsius and Fahrenheit.
    /*public static void main(String[] args) {
        System.out.println("Please choose to convert temperature in celsius or Fahrenheit by entering 'c' or 'f':");
        Scanner userInput = new Scanner(System.in);
        String convertType = userInput.nextLine();

        TemperatureConverter myConverterObj = new TemperatureConverter();

        switch (convertType) {

            case "c":
                System.out.println("Please enter temperature in celsius:");
                Scanner userInput1 = new Scanner(System.in);
                double c = Double.parseDouble(userInput.nextLine());


                System.out.println("Temperature in Fahrenheit: " + myConverterObj.celsiusToFahrenheit(c));
                break;

            case "f":
                System.out.println("Please enter temperature in Fahrenheit:");
                Scanner userInput2 = new Scanner(System.in);
                double f = Double.parseDouble(userInput.nextLine());
                System.out.println("Temperature in celsius: " + myConverterObj.fahrenheitToCelsius(f));
                break;
        }
    }
}*/


// Create a `Rectangle` class with fields for width and height, and methods to calculate area and perimeter.
    /*public static void main(String[] args) {

        Rectangle myObj = new Rectangle();

        myObj.rectangleUpdate(20, 40);

        System.out.println("Rectangle Area = "+ myObj.area()); ;

        System.out.println("Rectangle Perimeter = "+ myObj.perimeter());

    }
}*/


// Develop a `BankAccount` class with fields for balance and methods for depositing and withdrawing funds.
    /*public static void main(String[] args) {

        BankAccount myObj = new BankAccount();

        myObj.deposit(1000);

        myObj.showSaving();

        myObj.withdraw(11);

        myObj.showSaving();

        myObj.withdraw(2000);

        myObj.withdraw(989);

        myObj.showSaving();

    }
}*/


// Create a `Flight` class with fields for flight number, destination, and departure time.
   /* public static void main(String[] args) {

        Flight myObj = new Flight();

        myObj.flightDisplay();

    }
}*/


// Write a `Car` class with fields for make, model, and year of manufacture.


// Develop a `Playlist` class for a music player with methods to add, remove, and switch songs.
    /*public static void main(String[] args) {

        Playlist myObj = new Playlist();

        myObj.addSong("Boy's a liar Pt. 2");
        myObj.addSong("Not Strong Enough");
        myObj.addSong("Flowers");
        myObj.addSong("vampire");

        myObj.songListDisplay();

        myObj.removeSong("Flowers");

        myObj.songListDisplay();

    }
}*/

// ### 3. Methods in Classes
//  Add methods to the `Car` class for starting, stopping, and displaying the current state.
   /* public static void main(String[] args) {

        Car myObj = new Car();

        myObj.startCar();

        myObj.carStateDisplay();

        myObj.stopCar();

        myObj.carStateDisplay();

    }
}*/


// Develop a method in the `BankAccount` class to calculate the interest rate.
    /*public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the principal amount,interest paid and time in year separated by ',':");

        String[] inputString = userInput.nextLine().split(",");

        double principalAmount = Double.parseDouble(inputString[0]);
        double interestPaid = Double.parseDouble(inputString[1]);
        int time = Integer.parseInt(inputString[2]);


        BankAccount myObj = new BankAccount();

        System.out.println("Your interest = " + myObj.interestRate(principalAmount,interestPaid,time)+"%");

    }
}*/


// Write methods for the `Book` class that allow comparing books by title or author.
   /* public static void main(String[] args) {

        System.out.println("Please enter the first book title:");
        Scanner userInput1 = new Scanner(System.in);
        String firstBook = userInput1.nextLine();
        System.out.println("Please enter the second book title:");
        Scanner userInput2 = new Scanner(System.in);
        String secondBook = userInput1.nextLine();

        Book myObj = new Book();
        myObj.compareBook(firstBook, secondBook);

    }
}*/


// Add a method to the `Student` class to calculate the average grade based on scores.
    /*public static void main(String[] args) {

        Student myObj = new Student();

        myObj.addScore(75.6);
        myObj.addScore(85);
        myObj.addScore(60);
        System.out.format("Your average score is: %.0f", myObj.averageScore());

    }
}*/


// Create a method in the `TemperatureConverter` class to convert temperature to Kelvin.
    /*public static void main(String[] args) {

        System.out.println("Please enter temperature in Celsius:");
        Scanner userInput1 = new Scanner(System.in);
        TemperatureConverter myObj = new TemperatureConverter();
        System.out.println("The temperature in Kelvin: " + myObj.celsiusToKelvin(Double.parseDouble(userInput1.nextLine())));
    }
}*/


// . Develop methods for the `Rectangle` class that allow comparing rectangles by area.
    /*public static void main(String[] args) {

        System.out.println("Please enter first rectangle width and height separated by ',':");
        Scanner userInput1 = new Scanner(System.in);
        String[] inputString1 = userInput1.nextLine().split(",");
        double width1 = Double.parseDouble(inputString1[0]);
        double height1 = Double.parseDouble(inputString1[1]);

        System.out.println("Please enter second rectangle width and height separated by ',':");
        Scanner userInput2 = new Scanner(System.in);
        String[] inputString2 = userInput2.nextLine().split(",");
        double width2 = Double.parseDouble(inputString2[0]);
        double height2 = Double.parseDouble(inputString2[1]);

        Rectangle myObj = new Rectangle();
        int result = myObj.rectangleCompare(width1,height1,width2,height2);

        switch (result){

            case 1: {
                System.out.println("The first rectangle area is larger than the second one.");
                break;
            }
            case 2:{
                System.out.println("The first rectangle area is smaller than the second one.");
                break;
            }
            case 0:{
                System.out.println("Both rectangle have same area.");
                break;
            }
        }
    }
}*/


// Write overloaded methods for the `Calculator` class that allow operations with different numbers of operands.
    /*public static void main(String[] args) {

        Calculator myObj = new Calculator();

        System.out.println(myObj.substraction(10.5,5.5));
        System.out.println(myObj.addition(10,45,10));

    }
}*/


// Create a method in the `Flight` class to display information about the flight.
    /*public static void main(String[] args) {

        Flight myObj = new Flight();

        myObj.flightDisplay();

    }
}*/


// Develop a method in the `Car` class to compare two cars by year of manufacture.
    /*public static void main(String[] args) {

        Car myObj = new Car();

        myObj.addCar("VW", 2024);
        myObj.addCar("NISSAN", 2024);
        myObj.showInventory();
        myObj.carCompare();

    }
}*/


// Write a method in the `Playlist` class that returns a random song from the playlist.
    /*public static void main(String[] args) {

        Playlist myObj = new Playlist();

        myObj.addSong("Greedy");
        myObj.addSong("Paint The Town Red");
        myObj.addSong("Cruel Summer");
        myObj.addSong("Used To Be Young");
        myObj.addSong("Lil Boo Thang");
        myObj.addSong("What Was I Made For?");
        myObj.addSong("vampire");
        myObj.addSong("Everybody");
        myObj.addSong("Water");
        myObj.addSong("Lovin On Me");
        myObj.addSong("exes");
        myObj.addSong("Is It Over Now?");
        myObj.addSong("Rich Baby Daddy");
        myObj.addSong("Thinkin' Bout Me");
        myObj.addSong("Thinkin' Bout Me");
        myObj.addSong("Rockin' Around the Christmas Tree");

        myObj.randomSong();
        myObj.randomSong();
        myObj.randomSong();
        myObj.randomSong();
    }
}*/


// ### 4. Static and Non-static Methods
// Create a static method in the `MathHelper` class to find the maximum value in an array of numbers.
// PLease see MathHelper Class


//Write a non-static method in the `Counter` class that increments the counter value.
    /*public static void main(String[] args){

        Counter myObj = new Counter();

        myObj.increment();
        myObj.increment();
        myObj.increment();
        myObj.increment();

        System.out.println(myObj.getCount());
    }
}*/


// Develop a static method for the `TemperatureConverter` class that converts temperature from Fahrenheit to Celsius
    /*public static void main(String[] args) {

        System.out.println(TemperatureConverter.fToC(80));

    }
}*/


// Create a non-static method in the `User` class to check password matching.
    /*public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your password:");
        String password = input.nextLine();
        System.out.println("Please re-enter your password:");
        String confirm = input.nextLine();

        User myObj = new User();

        while(!myObj.passwordMatch(password,confirm)){
            System.out.println("Password dose not match");
            System.out.println("Please enter your password:");
            password= input.nextLine();
            System.out.println("Please re-enter your password:");
            confirm = input.nextLine();
        }

        if (myObj.passwordMatch(password,confirm)){
            System.out.println("Thanks you!");
        }
        else{
            System.out.println("Password dose not match");
        }

    }
}*/


// Write a static method in the `ArrayUtils` class to reverse an array.


// Develop a non-static method in the `Book` class to display information about the book.
    /*public static void main(String[] args) {

        Book myObj = new Book();

        System.out.println(myObj.getYearOfPublication());
        System.out.println(myObj.getTitle());
        System.out.println(myObj.getAuthor());

    }
}*/


// Create a static method in the `StringUtils` class to count the number of occurrences of a substring in a string.

// Write a non-static method in the `Circle` class to calculate the diameter of the circle. ?????
    /*public static void main(String[] args) {

        Circle myObj = new Circle();

        System.out.println("The circle diameter is: "+ myObj.circleDiameter(Double.parseDouble(args[0]))); ;

    }
}*/// Why this is not working when run from command prompt?


// Develop a static method in the `Calculator` class that determines whether a number is prime.
    /*public static void main(String[] args) {
        if(Calculator.isPrime(4) ){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }

    }
}*/


// Create a non-static method in the `EmailValidator` class to check the correctness of an email address.
    public static void main(String[] args) {

        EmailValidator myObj = new EmailValidator();

        System.out.println("Please enter your email:");

        Scanner userInput = new Scanner(System.in);

        boolean result = myObj.emailCheck(userInput.nextLine());

        while (!result) {

            System.out.println("Email is not valid.");
            System.out.println("Please re-enter your email:");
            result = myObj.emailCheck(userInput.nextLine());
        }
        System.out.println("Thank you! Your email is valid!");
    }
}











































