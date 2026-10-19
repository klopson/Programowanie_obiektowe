public class Car {

    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car() {
        brand = "Nieznana";
        model = "Nieznany";
        productionYear = 0;
        mileage = 0.0;
    }

    public Car(String marka, String model) {
        this.brand = brand;
        this.model = model;
        productionYear = 0;
        mileage = 0.0;
    }

    public Car(
            String brand,
            String model,
            int productionYear,
            double mileage
    ) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public void drive(double distance)
    {
        this.mileage+= distance;
    }

    public void showInformation()
    {
        System.out.println(this.model +" "+ this.model + " " + this.productionYear + " " + this.mileage);
    }
    public Car(Car other)
    {
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }

}
