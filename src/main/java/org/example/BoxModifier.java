package org.example;

public class BoxModifier {


    BoxModifier(){
        System.out.println("Default constructor of BoxModifier is called!");
    }

// code for private modifier variable
    /*public void changeValue (Box obj){

        obj.setNum(100);

    }

    public static void main(String[] args) {

        BoxModifier box1 = new BoxModifier();
        Box box2 = new Box();

        System.out.println("Num original value = "+ box1.getNum());
        box1.changeValue(box2);
        System.out.println("Num new value ="+ box2.getNum());

    }*/


    // code for default modifier variable
    public void changeValue (Box obj){

        obj.num =88;

    }

    public static void main(String[] args) {

        BoxModifier box1 = new BoxModifier();
        Box box2 = new Box();

        System.out.println("Num original value = "+ box2.num);
        box1.changeValue(box2);
        System.out.println("Num new value ="+ box2.num);

    }

}

