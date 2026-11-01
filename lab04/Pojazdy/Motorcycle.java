package Pojazdy;

public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String manufacturer, String model, String type) {
        super(manufacturer, model);
        this.type = type;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Type: " + type);
    }
}