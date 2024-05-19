//. Implement a Java program to perform basic operations on strings. The program should support the following operations:
//A.	Concatenate two strings.
//B.	Find the length of a string.
//C.	Convert a string to uppercase.
//D.	Convert a string to lowercase.
//E.	Check if a string contains a specific substring.
//F.	Replace a substring with another substring in a string.

package Lab;
import java.util.*;

public class StringO {

	public static void main(String[] args) {
		String s = new String("Hello");
		String b = new String("World");
		String cc =  s.concat(" "+b);
		System.out.println(cc);	
		System.out.println("length of string is: "+ cc.length());

		System.out.println("String to upper case: " + cc.toUpperCase());
		System.out.println("String to lower case: " + cc.toLowerCase());
		System.out.println("String contains specific substring : "+ cc.contains("Hello"));
		System.out.println("String replacement : "+ cc.replace("Hello", "Hii"));
		
		
		}
		

}
