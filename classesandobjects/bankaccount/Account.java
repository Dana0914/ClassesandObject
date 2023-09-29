package classesandobjects.bankaccount;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        if (balance < 0 || amount > balance) {
            System.out.println("Invalid operation");
        } else {
            balance -= amount;
            System.out.println("Withdrawal succesful. Your current balance is " + balance);
        }
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid operation");
        } else {
            balance += amount;
            System.out.println("Deposited succesfully. Your current balannce is " + balance);
        }
    }
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
