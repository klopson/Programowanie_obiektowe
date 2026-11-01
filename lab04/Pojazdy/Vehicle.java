package Pojazdy;

public class Vehicle {
    private String manufacturer;
    private String model;

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() { return manufacturer; }
    public String getModel() { return model; }

    public void showInformation() {
        System.out.println(manufacturer + " " + model);
    }

    @Override
    public String toString() {
        return "Vehicle: " + manufacturer + " " + model;
    }
}