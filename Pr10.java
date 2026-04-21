import java.util.*;

class Pr10{
    private String accountHolderName;
    private double balance;
    private static double interestRate = 0.05;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayInterest() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, balance);
        acc.displayInterest();

        System.out.print("\nEnter new interest rate: ");
        double newRate = sc.nextDouble();
        BankAccount.updateInterestRate(newRate);

        acc.displayInterest();

    }
}
/*output:
Enter Account Holder Name: John
Enter Balance: 10000

Account Holder: John
Balance: 10000.0
Interest Earned: 500.0

Enter new interest rate: 0.07

Account Holder: John
Balance: 10000.0
Interest Earned: 700.0*/
