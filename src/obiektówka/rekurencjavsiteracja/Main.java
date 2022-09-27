package obiektówka.rekurencjavsiteracja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj n:");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();


        Obliczenia obliczenia = new Obliczenia();
        double w = obliczenia.fibb(n);
        double x = obliczenia.Silnia(n);

        System.out.println(w + " " + x);
    }
}
