public class Animal {
    String name = " Rysiek ";

    public void makeSound() {
        System.out.println("Just like animals, animals animals mals");
    }

    public static void makeSound(Animal animal) {
        if (animal == null) {
            System.out.println("nie ma zwierzecia");
        } else {
            animal.makeSound();
        }
    }

    public static void present(Animal animal) {
        animal.makeSound();
    }
}

