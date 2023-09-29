package classesandobjects.bankaccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("John", "55854CAD", 5000);
        Account account2 = new Account("Lilly", "58966USD", 8000);
        account1.withdraw(250);
        account1.deposit(500);
        account2.withdraw(850);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
