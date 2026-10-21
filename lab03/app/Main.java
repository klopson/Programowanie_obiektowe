package app;
import animals.Cat;
import animals.Dog;

public class Main {
    static void main(String[] args) {
       z1();
       z2();
       z3();


    }
     public static void z1() {
         System.out.println("Zadanie 1");
         Dog Dog1 = new Dog("Goat",10);
         Cat Cat1 = new Cat("Szczepek",11);
         Dog1.makeSound();
         Cat1.makeSound();
     }

     public static void z2(){
         System.out.println("Zadanie 2");
         Person person1 = new Person("Pawel",22,"pawel@gmail.com");
         System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getEmail());
     }
    public static void z3() {
        System.out.println("Zadanie 3");
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
         
