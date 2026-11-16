public class Main {
    static void main(String[] args) {
        z1();
        z2();
        z3();
        z4();
        z5();
        z6();


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
    }
    public static void z5() {
        System.out.println("Zadanie 5");
    }
    public static void z6() {
        System.out.println("Zadanie 6");
    }
}
