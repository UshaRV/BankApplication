package Banking;

import java.util.Scanner;

public class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	BankAccount(String cName, String cId) {
		customerName = cName;
		customerId = cId;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
			
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited:" + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn:" + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction Occured");
		}

	}

	void showMenu()
	{
		char option =  '\0';
		Scanner scan =  new Scanner(System.in);
		System.out.println("Welcome"+customerName);
		System.out.println("your Id is"+customerId);
		System.out.println("\\n");
		System.out.println("A.checkBalance");
		System.out.println("B.Deposit");
		System.out.println(" C.Withdraw");
		System.out.println(" D.previousTransaction");
		System.out.println("E.exit");
		
		do
		{
			System.out.println("..............................");
			System.out.println("Enter an option");
			System.out.println("................................");
            option = scan.next().charAt(0);		
		  System.out.println("\\n");
		  
		  switch(option)
		  {
		  case 'A':
			  System.out.println("..............................");
			  System.out.println(" Balance = " + balance);
			  System.out.println("--------------------------------");
			  System.out.println("\n");
			  break;
		  case 'B':
			  System.out.println("..............................");
			  System.out.println(" Enter an amount to deposit");
			  System.out.println("--------------------------------");
			  int amount = scan.nextInt();
			  deposit(amount);
			  System.out.println("Amount Deposited");
			 
			  break;
		  case 'C':
			  System.out.println("..............................");
			  System.out.println(" Enter an amount to Withdraw");
			  System.out.println("--------------------------------");
			  int amount2 = scan.nextInt();
			  withdraw (amount2);
			  System.out.println("\n");
			  break;
		  case 'D':
			  System.out.println("..............................");
			 getPreviousTransaction();
			  System.out.println("--------------------------------");
			  System.out.println("\n");
			  break;
			  
		  case 'E':
			  System.out.println("............");
			  break;
	     default:
	    	 System.out.println("Invalid Option!!.please enter again");
	    	 break;
	      
		  }
		}
	while(option!='E') ;
		System.out.println("Thankyou for using our services");
	
			  
	}
}	
		
		
	
