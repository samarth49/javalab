//Write a Java program for user defined excision for valid email address.
//Program should check that the user has entered a valid email address which should contain @ and .
//otherwise it has to raise user defined exception InvalidEmailException.checks if the email contains '@' and '.', and 
//if '@' comes before '.'. If these conditions are met, it considers the email address valid; otherwise, it's considered invalid.

package Lab;
import java.util.*;
class EmailException extends Exception{
	public EmailException(String msg) {
		super(msg);
	}
}

public class InvalidE {
	public static void check(String email)throws EmailException {
		if(email==null || !email.contains("@") || !email.contains(".")) {
			throw new EmailException("Invalid email: Email must contains (@) and (.)" );
		}
		int firstp = email.indexOf("@");
		int lastp = email.indexOf(".");
		System.out.println(firstp+" "+ lastp);
		if(firstp > lastp) {
			throw new EmailException("Invalid email: (@) must come befor (.)" );
		}
		else {
			System.out.println("Email Address is valid");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email Address: ");
		String email = sc.nextLine();
		try {
			check(email);
		}
		catch(EmailException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
