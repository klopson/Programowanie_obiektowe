public class Main {
    static void main() {
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
    public static void z1()
    {
        System.out.println("Zadanie 1");
        Dog Dog1 = new Dog("zdzisiek","york",3);
        Dog Dog2 = new Dog("paweł","husky",70000);
        Dog1.bark();
        Dog1.showInformation();
        Dog2.bark();
        Dog2.showInformation();

    }
    public static void z2()
    {
        System.out.println("Zadanie 2");
        Point Point1 = new Point(3,2);
        Point Point2 = new Point(4,3);
        Point1.distance(Point2);

    }
    public static void z3()
    {
        System.out.println("Zadanie 3");
        Book Book1 = new Book();
        Book Book2 = new Book("Dżuma","Albert Camus");
        Book Book3 = new Book("Pan Tadeusz","Juliusz Słowacki",2004);
    }
    public static void z4()
    {
        System.out.println("Zadanie 4");
        Car auto1 = new Car("Toyota","yaris",2022,25000);
        Car auto2 = new Car("Opel","Astra H",2002,70000);
        auto2.drive(3000);
        auto2.showInformation();

    }
    public static void z5()
    {
        System.out.println("Zadanie 5");
        Car original = new Car("Toyota","yaris",2022,25000);
        Car copy = new Car(original);
        copy.mileage = 75000.0;
        System.out.println("Oryginał:");
        original.showInformation();

        System.out.println("Kopia:");
        copy.showInformation();
    }
    public static void z6()
    {
        System.out.println("Zadanie 6");
        Person first = new Person("Anna");
        Person second = first;
        second.name = "Maria";
        first.introduceYourself();
        second.introduceYourself();

    }
    public static void z7()
    {
        System.out.println("Zadanie 7");
        Person first = new Person("Anna");
        Person second = new Person(first);
        second.name = "Szczepan";
        first.introduceYourself();
        second.introduceYourself();
    }

    public static void z8()
    {
        System.out.println("Zadanie 8");
        Counter c1 = new Counter(10);
        Counter c2 = new Counter(20);
        System.out.println("Przed wywołaniem:");
        System.out.println("c1 value: " + c1.value);
        System.out.println("c2 value: " + c2.value);
        c1.increaseOther(c2);
        System.out.println("Po wywołaniu:");
        System.out.println("c1 value: " + c1.value);
        System.out.println("c2 value: " + c2.value);

    }
    public static void z9()
    {
        System.out.println("Zadanie 9");
        Car car = null;
        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Obiekt 'car' nie został zainicjalizowany (wynosi null)!");
        }

    }
    public static void z10()
    {
        System.out.println("Zadanie 10");
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b);
        System.out.println(a == c);



    }
    public static void z11()
    {
        System.out.println("Zadanie 11");
        Product product = new Product("Monitor", 1200);

        product.show();

    }
    public static void z12()
    {
        System.out.println("Zadanie 12");
        Movie movie = new Movie("Auta", 116);
        Screening screening = new Screening(movie, "19:30");
        Ticket ticket = new Ticket(screening, 15, 25.0);
        ticket.printTicket();

    }





}
