package Pojazdy;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String manufacturer, String model, int numberOfDoors) {
        super(manufacturer, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Doors: " + numberOfDoors);
    }
}
