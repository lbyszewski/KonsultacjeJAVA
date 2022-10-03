package obiektówka.Agregacja;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.PESEL = "5656564645";
        BankAccount bankAccount = new BankAccount();
        bankAccount.ownerAccount = person;
    }
}
