package org.example;
import java.util.Scanner;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Lesson3 {

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

        myObj.showBalance();

        myObj.withdraw(11);

        myObj.showBalance();

        myObj.withdraw(2000);

        myObj.withdraw(989);

        myObj.showBalance();

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
    public static void main(String[] args) {

        Playlist myObj = new Playlist();

        myObj.addSong("Boy's a liar Pt. 2");
        myObj.addSong("Not Strong Enough");
        myObj.addSong("Flowers");
        myObj.addSong("vampire");

        myObj.songListDisplay();

        myObj.removeSong("Flowers");

        myObj.songListDisplay();

    }
}























