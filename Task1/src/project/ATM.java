package project;
import java.util.Scanner;
public class ATM {
	private int balance;
	private int pin;
	
	private ATM(int balance,int pin) {
		this.balance=balance;
		this.pin=pin;
	}
	public void displaymenu() {
		System.out.println("1. Check Balance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdral");
		System.out.println("4. Change Pin");
		System.out.println("5. Exit");
	}
	public void deposite(int amount) {
		balance+=amount;
		System.out.println(balance);
	}
	public void withdral(int amount) {
		if(balance<amount) {
			System.out.println("Your bank fasing insufficient balance ");
			return;
		}else {
		balance-=amount;
		System.out.println(balance);
		}
	}
	public int getBalance() {
		return balance;
	}
	public boolean validPin(int pin) {
		return this.pin==pin;
	}
	public void ChangePin(int newpin) {
		this.pin=newpin;
		System.out.println(" Pin change"+pin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ATM atm=new ATM(10000,7777);
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		if(atm.validPin(pin)) {
			int option=0;
			while(option!=5) {
				atm.displaymenu();
				System.out.println("Enter your desire number to know the result listed above");
				 option=sc.nextInt();
				 switch(option) {
				 case 1:
					 System.out.println("Your respective balance is"+atm.getBalance()); 
					 break;
				 case 2:
					 System.out.println("Enter your Amount");
					int amount=sc.nextInt();
					atm.deposite(amount);
					break;
				 case 3:
					 System.out.println("Enter the Amount");
					 amount=sc.nextInt();
					  atm.withdral(amount);
					 break;
				 case 4:
					 System.out.println("Enter the new pin");
					  pin=sc.nextInt();
					  atm.ChangePin(pin);
					  break;
				 case 5:
					 System.out.println("Thanks for using ATM Machaine");
					 break;
				 default:
					 break;
					 
				 }
			}
		}else {
			System.out.println("You have entered a invalid pin");
		}
		

	}

}
