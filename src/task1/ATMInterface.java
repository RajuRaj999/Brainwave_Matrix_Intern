package task1;
import java.util.Scanner;
public class ATMInterface {
	    private static double balance = 10000.0; 

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       

	        System.out.println("Welcome to the ATM!");
	        System.out.println();
	        boolean exit = false;
	        while (exit==false) {
	            System.out.println("Please choose an option:");
	            System.out.println();
	            System.out.println("1. Balance Enquiry");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    balanceEnquiry();
	                    break;
	                case 2:
	                    System.out.print("Enter the amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter the amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    exit = true;
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	        scanner.close();
	    }

	    // Method to Balance Enquiry
	    private static void balanceEnquiry() {
	        System.out.printf("Your current balance is: "+balance);
	        System.out.println();
	    }

	    // Method to deposit money
	    private static void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.printf("deposited successfully. Updated balance: "+balance);
	            System.out.println();
	        } else {
	            System.out.println("Invalid amount. Please enter a positive number.");
	            System.out.println();
	        }
	    }

	    // Method to withdraw money
	    private static void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.printf("withdrawn successfully. Updated balance: "+balance);
	                System.out.println();
	            } else {
	                System.out.println("Insufficient balance. Please enter a smaller amount.");
	                System.out.println();
	            }
	        } else {
	            System.out.println("Invalid amount. Please enter a positive number.");
	            System.out.println();
	        }
	    }
	}



