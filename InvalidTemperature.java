package Lab;
import java.util.*;
//4.	Implement a program for a temperature converter. The program should convert temperatures between Celsius and Fahrenheit. 
//However, there are certain constraints:
//I. The temperature value should be within a valid range (-273.15°C to 1000°C).
//Ii. The conversion should only be performed if the input temperature is within the valid range.
//Your task is to implement a Java program that handles these constraints using custom exceptions. 
//Define a custom exception class InvalidTemperatureException to handle the case when the input temperature is outside the valid range.
//
class InvalidTemperatureException extends Exception{
	public InvalidTemperatureException(String message) {
		super(message);
	}
}
public class InvalidTemperature {
	public static int calculate(int temp) throws  InvalidTemperatureException{
		if(temp > 1000 || temp < -273.15) {
			throw new InvalidTemperatureException("Temperature not in range");
		}
		return temp*(9/5) + 32;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celcius: ");
		int temp = sc.nextInt();
		int ans=0;
		try {
			ans = calculate(temp);
			System.out.println("Ans is : "+ ans);
			
		}
		catch(InvalidTemperatureException e){
			System.out.println(e);
		}
	}

}
