import java.util.Scanner;

public class CheckingAccount implements HasMenu {
    private double balance;
    private static Scanner input = new Scanner(System.in);

    public CheckingAccount() {
        this.balance = 0.0;
    }

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getBalanceString() {
        return String.format("$%.2f", balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String menu() {
        return "\nAccount menu\n" +
               "0) quit\n" +
               "1) check balance\n" +
               "2) make a deposit\n" +
               "3) make a withdrawal\n\n" +
               "Please enter 0-3: ";
    }

    public void start() {
        boolean done = false;
        while (!done) {
            System.out.print(menu());
            String choice = input.nextLine();
            switch (choice) {
                case "0":
                    done = true;
                    break;
                case "1":
                    checkBalance();
                    break;
                case "2":
                    makeDeposit();
                    break;
                case "3":
                    makeWithdrawal();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + getBalanceString());
    }

    public void makeDeposit() {
        System.out.print("Enter deposit amount: ");
        double amount = Double.parseDouble(input.nextLine());
        setBalance(balance + amount);
        System.out.println("Deposit successful.");
    }

    public void makeWithdrawal() {
        System.out.print("Enter withdrawal amount: ");
        double amount = Double.parseDouble(input.nextLine());
        if (amount <= balance) {
            setBalance(balance - amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
