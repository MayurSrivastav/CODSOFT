import java.util.*;
class BankAccount {
    private double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit!");
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Not enough balance!");
    }
    double checkBalance() {
        return balance;
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("\n1. Balance  2. Deposit  3. Withdraw  4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) System.out.println("Balance: " + account.checkBalance());
            else if (choice == 2) { 
                System.out.print("Enter amount: "); 
                account.deposit(sc.nextDouble()); 
            }
            else if (choice == 3) { 
                System.out.print("Enter amount: "); 
                account.withdraw(sc.nextDouble()); 
            }
            else if (choice == 4) { 
                System.out.println("Thankyou!"); 
                break; 
            }
            else System.out.println("Invalid option!");
        }
    }
}
