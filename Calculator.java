//6.	implement a Java program to represent a simple calculator. The calculator should have the following features:
//A.	Addition of two numbers
//B.	Subtraction of two numbers
//C.	Multiplication of two numbers
//D.	Division of two numbers
//Additionally, the program should initialize a constant value for the value of PI (3.14) and 
//print a welcome message when an instance of the calculator is created. (static block)
//Print “New calculator instance” using the instance block.
//Your task is to implement a Java program that demonstrates the use of constructors, static block, and instance block
//to achieve these features.

package Lab;
import java.util.*;
public class Calculator {
	private double pi=3.14;
	static {
		System.out.println("Welcone ");
	}
	{
		System.out.println("New calculator instance");
	}
	public Calculator(){
		System.out.println("Constructor called");
	}
	public double add(double a, double b) {
		return a+b;
	}
	public double sub(double a, double b) {
		return a-b;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double div(double a, double b) {
		 if (b != 0) {
	            return a / b;
	        } else {
	            throw new IllegalArgumentException("Division by zero is not allowed.");
	        }
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Calculator c1 = new Calculator();
		double ans1=c.add(10, 20);
		double ans2 =c.sub(10, 20);
		System.out.println("Addition is : "+ans1);
		System.out.println("Substraction is: "+ans2);
		System.out.println("Multiplication is: "+c.mul(10,20));
		System.out.println("Division is : "+c.div(10, 0));
		
		
		
	}

}
