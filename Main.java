import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CheckingAccount checking = new CheckingAccount(100.00);
        SavingsAccount savings = new SavingsAccount(200.00);
        Customer customer = new Customer("Alice", "1111", checking, savings);

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        System.out.print("Enter PIN: ");
        String enteredPin = input.nextLine();

        if (customer.login(enteredUsername, enteredPin)) {
            System.out.println("\nUser name: " + customer.getUsername());
            System.out.println("PIN: " + customer.getPin());
            System.out.println("Login Successful");

            // Extra credit 
            System.out.println("Welcome back, " + customer.getUsername() + "! Have a great day!");

            customer.start();
        } else {
            System.out.println("Login failed.");
        }

        input.close(); 
    }
} 

