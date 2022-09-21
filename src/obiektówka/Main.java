package obiektówka;

public class Main {
    public static void main(String[] args) {

        // obiekt klasy Person z argumentami pola lub z wypisanym osobno polem , należy pamiętać , że każdy obiekt posiadający konstruktor argumentowy
        Person personOne = new Person("dgdfdf","sfsdsfffs",40);
        personOne.firstName =" ffdfdf";
        personOne.lastName = "fsffsf";
        personOne.myAge = 40;

        // wywołanie na podstawie obiektu  metody dołacoznej przez operator kropki to samo przy polach
        personOne.showResult();
    }
}
