package app;

public class InitializationDemo {


    public static String staticField = printAndReturn("Pole statyczne");

    static {
        System.out.println("Blok statyczny");
    }


    public String instanceField = printAndReturn("Pole instancji");


    {
        System.out.println("Blok instancyjny");
    }


    public InitializationDemo() {
        System.out.println("Konstruktor");
    }


    private static String printAndReturn(String text) {
        System.out.println(text);
        return text;
    }
}