import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. deklaracja
         int firstValue;  // camelCase     pierwsza litera kolejnego członu zawsze duża reszta małe
        // 2. incjalizacja
         int secondValue = 5;
         //3.  typy zmiennych
        int a; // liczby całkwowite
        double w;  // zmiennoprzecinkowe
        String napis = "sfsds";  // ciąg znaków
        char znak = 'z';  // wybrany znak
        long dlugieLiter = 511020354100005L;
        boolean wyznacznik = true;   //prawda fałsz

        //4. operatory arytmetyczne i logiczne
        // + * - / += -= *= /=  %      && ||  !=

        //5. Instrukcja warunkowa i pętla for
        for(int i = 0;i<=100;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }

        //6. tablica
        int[] tab = new int[10]; // typ int tablicowy stwórz nowy int o rozmiarze 10 - index tablciy od 0 do 9

        //7. Klasa Skaner do wprowadzania danych

        Scanner scanner = new Scanner(System.in);   // nowy obiekt skanera
        int c = scanner.nextInt();                  //  przypisuje do zmiennej tego samego typu skaner z dołączoną metodą nextInt - metoda zależy od dołączonej zmiennej nextDouble() - double , String - next()

        System.out.println(c + " ffereferf");   // wyświetlenie zmiennej i przez znak konkatenacji dodanie komunikatu





    }
}