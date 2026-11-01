import Pojazdy.Motorcycle;
import Pojazdy.Truck;
import abc.C;
import auto.Car;
import pakiet2.Employee;
import animal.*;
import pakiet2.Manager;
import Devices.*;
import Gamee.*;
import Hierarchy.*;

public class Main {
    static void main(String[] args) {
        z1();
        z2();
        z3();
        z4();
        z5();
        z6();
        z7();
        z8();
        z9();
        z10();
        z11();
        z12();


    }
    public static void z1() {
        System.out.println("Zadanie 1");
        Employee employee = new Employee("Jakub","Kraszewski","Switch");
        employee.showInformation();
    }

    public static void z2(){
        System.out.println("Zadanie 2");
    }
    public static void z3() {
        System.out.println("Zadanie 3");
        Car car = new Car("Opel","Astra", 5);
        car.showInformation();
    }
    public static void z4() {
        System.out.println("Zadanie 4");
        new C();
    }
    public static void z5() {
        System.out.println("Zadanie 5");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
    public static void z6() {
        System.out.println("Zadanie 6");
        Manager manager = new Manager("Jan", "Pawel","head","management");
        manager.showInformation();
    }
    public static void z7() {
        System.out.println("Zadanie 7");
        Laptop laptop = new Laptop("Lenovo",16,4500);
        laptop.turnOn();
        laptop.showRam();
        laptop.checkBattery();
    }
    public static void z8() {
        System.out.println("Zadanie 8");
        Book book = new Book("Albert Camus","Dżuma",1840);
        System.out.println(book);
        System.out.println(book.getClass());
    }
    public static void z9() {
        System.out.println("Zadanie 9");
        Rpg game = new Rpg();
        game.start();

    }
    public static void z10() {
        System.out.println("Zadanie 10");
        Report report = new Report();
        Document copy = report.copy();
        System.out.println(copy.getClass());
    }
    public static void z11() {
        System.out.println("Zadanie 11");
        Student student = new Student("Bożydar",341414225);
        student.showInformation();

    }
    public static void z12() {
        System.out.println("Zadanie 12");
        Pojazdy.Car car = new Pojazdy.Car("Mitsubishi","Lancer",5);
        Motorcycle moto = new Motorcycle("Honda", "CBR", "sportowy");
        Truck truck = new Truck("Volvo", "FH16", 20.5);

        car.showInformation();
        moto.showInformation();
        truck.showInformation();

        System.out.println(car.toString());
    }


}
