package AQA;

public class AmphibiousVehicle implements WaterVehicle,LandVehicle{

    @Override
    public void dive() {

        System.out.println("Dive! Dive! Dive!");

    }

    @Override
    public void snow() {

        System.out.println("Snow mode on!");

    }

    @Override
    public void offRoad() {

        System.out.println("Off road mode on!");
    }


    public static void main(String[] args) {

        AmphibiousVehicle obj1 = new AmphibiousVehicle();

        obj1.dive();
        obj1.offRoad();
        obj1.snow();

    }

}
