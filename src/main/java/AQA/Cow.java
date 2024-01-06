package AQA;

public class Cow implements Animal {

    @Override
    public void makeSound() {

        System.out.println("moo! moo! moo!");

    }

    public static void main(String[] args) {

        Cow obj1 = new Cow();

        if(obj1.isPet()){

            System.out.println("This is a pet");
        };


    }
}


