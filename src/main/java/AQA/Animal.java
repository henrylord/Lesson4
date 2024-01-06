package AQA;

public interface Animal {

     void makeSound();

     default boolean isPet(){

          return true;
     }


}
