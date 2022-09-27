package obiektówka.rekurencjavsiteracja;

public class Obliczenia {

    public double Silnia(double n){
        if(n==0){
            return 1;
        } else {
            return n * Silnia(n-1);
        }
    }

    public double fibb(double n){
        if(n<3){
            return 1;
        } else {
            return fibb(n-2)+fibb(n-1);
        }
    }

}
