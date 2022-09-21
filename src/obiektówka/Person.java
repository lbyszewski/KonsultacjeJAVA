package obiektówka;
// Klasa  jako główny element
public class Person {

    // właściwości klasy - pola
    public  String firstName;
    public  String lastName;
    public  int myAge;

    // konstruktor argumentowy na podstawie stworzonych pól

    public Person(String firstName, String lastName, int myAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAge = myAge;
    }
    // metoda wyświetlająca zawartośc wykorzystanych w klasie Main pól
    public void showResult(){
        System.out.println(firstName + " " + lastName + " " + myAge);
    }
}
