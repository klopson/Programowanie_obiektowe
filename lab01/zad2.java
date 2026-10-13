import java.util.Scanner;

public class zad2 {
    static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Podaj liczbe:");

        int n = myObj.nextInt();

        if (n % 2 == 0) {
            System.out.println("liczba jest parzysta");

        } else {
            System.out.println("liczba nie jest parzysta");
        }
        if (n % 3 == 0) {
            System.out.println("liczba jest podzielna przez 3");

        }
        else {
            System.out.println("liczba nie jest podzielna przez 3");
        }
        int suma = 0;
        int parzyste = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
            if(i % 2 == 0)
            {
                parzyste += 1;
            }
        }
        System.out.println("suma wynosi: " + suma);
        System.out.println("liczb parzystych: " + parzyste);
    }
}
