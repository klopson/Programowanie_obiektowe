import java.util.Scanner;



public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = new int[10];
        for(int i = 0;i < 10;i++)
        {
            System.out.println("Podaj liczbę " + i);
            liczby[i] = scanner.nextInt();
        }
        int najwieksza = liczby[0];
        int najmniejsza = liczby[0];
        int suma = 0;
        var srednia = 0.0;
        int wieksze_od_sr = 0;
        for(int i = 0;i < 10;i++)
        {
            if(najwieksza < liczby[i])
            {
                najwieksza = liczby[i];
            }
            if(najmniejsza > liczby[i])
            {
                najmniejsza = liczby[i];
            }
            suma += liczby[i];

            }
        srednia = (double) suma / liczby.length;
        for(int i = 0;i < 10;i++)
        {
            if(liczby[i] > srednia)
            {
                wieksze_od_sr++;
            }
        }


        System.out.println("najwieksza liczba: " + najwieksza);
        System.out.println("najmniejsza liczba: " + najmniejsza);
        System.out.println("suma liczb: " + suma);
        System.out.println("średnia arytmetyczna liczb: " + srednia);
        System.out.println("liczba wartości wiekszych od średniej: " + wieksze_od_sr);
        }

    }

