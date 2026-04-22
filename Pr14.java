import java.util.*;

class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 4.0;

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest on Savings Account: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double rate;
    int time;

    public void maturityAmount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter interest rate (%): ");
        rate = sc.nextDouble();

        System.out.print("Enter time (years): ");
        time = sc.nextInt();

        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount: " + maturity);
    }
}

public class Pr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavingAccount sa = new SavingAccount();
            sa.openAccount();
            sa.deposit();
            sa.withdraw();
            sa.checkBalance();
            sa.calculateInterest();
        } else if (choice == 2) {
            FixedDepositAccount fd = new FixedDepositAccount();
            fd.openAccount();
            fd.deposit();
            fd.checkBalance();
            fd.maturityAmount();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
/*output:
1. Saving Account
2. Fixed Deposit Account
Choose account type: 1
Enter Account Number: 101
Enter Account Holder Name: Nidhi
Enter Initial Balance: 5000
Enter amount to deposit: 2000
Amount deposited successfully.
Enter amount to withdraw: 1000
Withdrawal successful.
Current Balance: 6000.0
Interest on Savings Account: 240.0
  */
