package Project_7;

public class Account {
    public int id;
    public String name;
    public double balance;

    public Account() {
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("The current account balance is: " + balance);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("The current account balance is: " + balance);
    }
}    