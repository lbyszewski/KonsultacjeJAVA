package obiektówka.Enkapsulacja;

public class Obliczenia {

    public double proste(double w, double x){
       return obliczenia(w,x);


    }

    private double obliczenia(double a, double b){
        double result = 1;
       if(a % 5 == 0 && b % 3 == 0){
           for (int i = (int)a;i<=b;i++){
               result*=i;

           }

       }
        return result;
    }


}
