package Devices;

public class Computer extends Device{
    int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }
    public void showRam(){
        System.out.println("Ram: " + ramGb);
    }
}
