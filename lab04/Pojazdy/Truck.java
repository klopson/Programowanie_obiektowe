package Pojazdy;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String manufacturer, String model, double loadCapacity) {
        super(manufacturer, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Load capacity: " + loadCapacity);
    }
}