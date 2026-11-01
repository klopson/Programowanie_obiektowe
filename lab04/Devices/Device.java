package Devices;

public class Device {
    String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void turnOn(){
        System.out.println("Device turned on");
    }
}
