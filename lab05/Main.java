public class Main {
    static void main(String[] args) {
        z1();
        z2();
        z3();
        z4();
        z5();
        z6();
        System.out.println("Zadanie 7");
        Animal first = new Dog();
        Animal second = new Cat();
        specialAction(first);
        specialAction(second);
        z8();
        z9();
        z10();
        z11();
        z12();
        z13();

    }
    public static void z1() {
        System.out.println("Zadanie 1");
        Animal first = new Dog();
        Animal second = new Cat();
        first.makeSound();
        second.makeSound();
    }
    public static void z2() {
        System.out.println("Zadanie 2");
        Animal[] animals ={new Dog(),new Cat(),new Cow(),new Sheep()};
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
    public static void z3() {
        System.out.println("Zadanie 3");
        Animal.present(new Cat());
        Animal.present(new Sheep());
        Animal.present(new Cow());
        Animal.present(new Dog());


    }
    public static void z4() {
        System.out.println("Zadanie 4");
        Employee[] employees = {
                new Developer("Anna", 8000, 1500),
                new Tester("Marek", 6500, 20, 50),
                new Manager("Katarzyna", 10000, 2500),
        };
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (" + employee.getClass().getSimpleName() + "): " + employee.calculateSalary() + " zł");
        }
    }
    public static void z5() {
        System.out.println("Zadanie 5");
        Dog dog = new Dog();
        Animal animal = dog;
        dog.name = "Reksio";
        System.out.println("Odczyt przez animal: " + animal.name);
    }
    public static void z6() {
        System.out.println("Zadanie 6");
        Animal first = new Dog();
        Animal second = new Cat();
        if(first instanceof Dog){
            Dog dog = (Dog) first;
            dog.digHole();
        }
        if(second instanceof Cat){
            Cat cat = (Cat) second;
            cat.climb();
        }

    }
    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog)
        {
            dog.digHole();
        } else if (animal instanceof Cat cat)
        {
            cat.climb();
        }
    }
    public static void z8() {
        System.out.println("Zadanie 8");
        Animal Dog = new Dog();
        Animal Cat = new Cat();
        Animal Sheep = new Sheep();
        Animal Cow = new Cow();
        Animal.makeSound(Dog);
        Animal.makeSound(Cat);
        Animal.makeSound(Cow);
        Animal.makeSound(Sheep);
    }
    public static void z9() {
        System.out.println("Zadanie 9");
        Parent object = new Child();
        System.out.println(object.value);
        System.out.println(object.getValue());
    }

    static void identify(Animal animal) {
        System.out.println("Animal");
    }
    static void identify(Dog dog) {
        System.out.println("Dog");
    }
    public static void z10() {
        System.out.println("Zadanie 10");
    Animal animal = new Dog();
    identify(animal);
    animal.makeSound();
    }
    public static void z11() {
        System.out.println("Zadanie 11");
        Animal animal = new GuideDog();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof GuideDog);
        System.out.println(animal.getClass() == Animal.class);
        System.out.println(animal.getClass() == Dog.class);
        System.out.println(animal.getClass() == GuideDog.class);

    }
    public static void z12(){
        System.out.println("Zadanie 12");
        Payment[] payments = {new BlikPayment(),new CardPayment(),new TransferPayment()};
        for (Payment payment : payments) {
            payment.pay(99.99);
        }
    }

    public static void printShape(Shape shape){
        System.out.println("Figura: " + shape.getName() + " Pole" + shape.area());
    }
    public static void z13(){
        System.out.println("Zadanie 13");
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};
        for(Shape shape : shapes){
            printShape(shape);
        }
    }
}
