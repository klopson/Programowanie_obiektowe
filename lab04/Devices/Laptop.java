package Devices;

public class Laptop extends Computer{
    int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }
    public void checkBattery(){
        System.out.println("Battery capacity: " + batteryCapacityWh);
    }
}
