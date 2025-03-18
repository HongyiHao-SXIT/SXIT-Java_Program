package Project_7;

public class AccountDemo {
    public static void main(String[] args) {
        Account myAccount;
        myAccount = new Account();
        myAccount.id = 1001;
        myAccount.name = "Hongyi Hao";
        myAccount.deposit(5000.00);
        myAccount.withdraw(3000.00);

        System.out.println("Account ID = " + myAccount.id);
        System.out.println("Name = " + myAccount.name);
        System.out.println("Balance = " + myAccount.balance);
    }
}    