import java.util.Scanner;
public class BankAccount implements ATM{
	public double balance;
	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}
	public double checkBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println(" Deposited    : Rs "+amount);
			System.out.println(" Total Amount : Rs "+balance);
		}
		else {
			System.out.println(" Invalid Amount ");
		}
	}
   
	public void withdraw(double amount) {
		if(amount>0 && balance>=amount) {
			balance -= amount;
			System.out.println(" Withdraw     : Rs "+amount);
			System.out.println(" Total Amount : Rs "+balance);
		}
		else {
			System.out.println(" Insufficient balance");
		}
	}
	public static void main(String[] args) {
		BankAccount obj = new BankAccount(10000);
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			System.out.println("-----------------");
			System.out.println("     ATM MENU    ");
			System.out.println("-----------------");
			System.out.println("1) Check Balance");
			System.out.println("2) Deposit");
			System.out.println("3) Withdraw");
			System.out.println("4) Exit");
			System.out.println();
			System.out.print(" Enter your choice : ");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				System.out.println(" Balance : Rs "+obj.checkBalance());
				System.out.println();
				break;
			case 2:
				System.out.print(" Enter deposit amount : Rs ");
				double depositAmount = sc.nextDouble();
				obj.deposit(depositAmount);
				System.out.println();
				break;
			case 3:
				System.out.print(" Enter the withdrawl amount : Rs ");
				double withdrawAmount = sc.nextDouble();
				obj.withdraw(withdrawAmount);
				System.out.println();
				break;
			case 4:
				exit = true;
				break;
			default:
				System.out.println(" Invalid choice. Please try again");
			}
	    }
		sc.close();
		System.out.println(" Thank you for using ATM !");
		System.out.print(" Visit Again !");
	}
	
}	   