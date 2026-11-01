package auto;

public class Car extends Vehicle{
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void showInformation(){
        System.out.println("Brand: " + getBrand() + " model: " + getModel() +  " liczba drzwi: " + numberOfDoors);
    }
}
