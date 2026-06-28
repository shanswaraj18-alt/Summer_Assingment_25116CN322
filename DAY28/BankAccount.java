package DAY28;

public class BankAccount {
    int balance = 1000;
    void deposit(int amount) {
        balance += amount;
        System.out.println("Balance = " + balance);
    }
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(500);
        b.withdraw(300);
    }
}
    

