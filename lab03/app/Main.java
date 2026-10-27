package app;
import animals.Cat;
import animals.Dog;

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
       z11();
       z12();
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
        int[] tab = {10, 20, 30};
        ExamResults results = new ExamResults(tab);
        tab[0] = 99;
        results.getPoints()[1] = 88;
        int[] aktualnePunkty = results.getPoints();
        System.out.println("Wartości w obiekcie: " + aktualnePunkty[0] + ", " + aktualnePunkty[1] + ", " + aktualnePunkty[2]);
    }
    public static void z5() {
        System.out.println("Zadanie 5");
        System.out.println("Licznik na początku: " + Product.getNumberOfProducts());

        Product p1 = new Product("Mleko", 4);
        Product p2 = new Product("Chleb", 5);
        Product p3 = new Product("Kawa", 20);

        System.out.println("Licznik po utworzeniu 3 produktów: " + Product.getNumberOfProducts());
    }
    public static void z6() {
        System.out.println("Zadanie 6");


        Product p4 = new Product("Kawa 2", 20);
        Product p5 = new Product("Kawa 3", 20);
        System.out.println("Licznik produktów: " + Product.getNumberOfProducts());

    }
    public static void z7() {
        System.out.println("Zadanie 7");


            System.out.println("Dodawanie : " + StaticCalculator.add(5, 3));
            System.out.println("Odejmowanie : " + StaticCalculator.subtract(10, 4));
            System.out.println("Mnożenie : " + StaticCalculator.multiply(6, 7));

            System.out.println("Wykonana liczba operacji: " + StaticCalculator.getNumberOfOperations());

    }
    public static void z8() {
        System.out.println("Zadanie 8");
        System.out.println("add(int, int): " + StaticCalculator.add(2, 3));
        System.out.println("add(int, int, int): " + StaticCalculator.add(2, 3, 4));
        System.out.println("add(double, double): " + StaticCalculator.add(2.5, 3.5));

        System.out.println("Licznik operacji: " + StaticCalculator.getNumberOfOperations());
    }
    public static void z9() {
        System.out.println("Zadanie 9");


        System.out.println("Tworzenie pierwszego obiektu");
        InitializationDemo demo1 = new InitializationDemo();

        System.out.println("Tworzenie drugiego obiektu");
        InitializationDemo demo2 = new InitializationDemo();


    }
    public static void z10() {
        System.out.println("Zadanie 10");
    }
    public static void z11() {
        System.out.println("Zadanie 11");
        User user = new User("jan_kowalski", "tajneHaslo123", 25);
        user.showUser();
        System.out.println("Czy '1234' to poprawne hasło? " + user.checkPassword("1234"));
        System.out.println("Czy 'tajneHaslo123' to poprawne hasło? " + user.checkPassword("tajneHaslo123"));
    }
    public static void z12() {
            System.out.println("Zadanie 12");

            Student s1 = new Student("Jan Kowalski", "s12345");
            s1.updateName("Jan", "Nowak");

            Course c1 = new Course("Programowanie w Javie");
            Course c2 = new Course("Bazy Danych", 15);

            System.out.println("Student: " + s1.getName() + " (Album: " + s1.getAlbumNumber() + ")");
            System.out.println("Utworzone kursy: " + Course.getNumberOfCreatedCourses());

    }

}        
         
