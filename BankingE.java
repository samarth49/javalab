//Develop a Java program demonstrating custom exception handling for 
//bank account withdrawals. Define a WithdrawalException class to handle insufficient funds scenarios. 
//Implement a BankAccount class with a withdraw method, throwing WithdrawalException when necessary. 
//Create a user interface to input account details and withdrawal amount, catching and displaying custom exception messages.
package Lab;
import java.util.*;
class BankDetails{
	private int balance;
	public BankDetails() {
		
	}
	public BankDetails(int balance) {
		this.balance=balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	
}
class Withdrawls extends Exception{
	public Withdrawls(String msg) {
		super(msg);
	}
}
public class BankingE {
	public static int withdrw(BankDetails bd) throws Withdrawls{
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the amt of withdrawls: ");
			int wd = sc.nextInt();
			sc.nextLine();
			
			if(bd.getBalance() <= wd ) {
				throw new Withdrawls("Insufficient balance"); 
			}
			else {
				bd.setBalance(bd.getBalance() - wd);
				System.out.println("Withdraw successfully");
				System.out.println("BankBalance: "+ bd.getBalance());
			}
		}catch(Withdrawls e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		return bd.getBalance();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance");
		int balance = sc.nextInt();
		sc.nextLine();
		BankDetails bd = new BankDetails();
		bd.setBalance(balance);
		try {
			int remaining_balance = withdrw(bd);
		} catch (Withdrawls e) {
			e.printStackTrace();
		}
		
	}

}
