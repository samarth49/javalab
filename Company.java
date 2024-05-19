package Lab;
import java.util.*;
//2.	Write a Java program to manage employees in a company. The company has different types of employees, including full-time employees and part-time employees.  
//Each employee has a name, employee ID, and hourly rate.
//Full-time employees have additional attributes such as salary and benefits,
//(Use super keyword)
//while part-time employees have attributes for the number of hours worked and overtime rate.
//(Use super keyword)
//Your task is to implement a Java program using inheritance to represent these different types of employees and their attributes. 
//Additionally, the program should provide functionality to calculate the monthly salary for each type of employee.

class Employee{
	private String Name;
	private int id;
	private int rate;
	public Employee(String Name,int id, int rate) {
		this.Name=Name;
		this.id=id;
		this.rate=rate;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setRate(int rate) {
		this.rate=rate;
	}
	public int getRate() {
		return rate;
	}
	
	
}
class FullTimeE extends Employee {
	private int salary;
	private int benefits;

	public FullTimeE(String Name, int id, int rate,int salary,int benfits) {
		super(Name, id, rate);
		this.benefits = benefits;
		this.salary=salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setBenefits(int benefits) {
		this.benefits=benefits;
	}
	public int getBenefits() {
		return benefits;
	}

}
class PartTime extends Employee{
	private int hrs;
	private int OTrate;
	public PartTime(String Name, int id, int rate,int hrs,int OTrate) {
		super(Name,id,rate);
		this.OTrate=OTrate;
		this.hrs=hrs;
		
	}
	public void setHrs(int hrs) {
		this.hrs=hrs;
	}
	public int getHrs() {
		return hrs;
	}
	public void setOTrate(int OTrate) {
		this.OTrate=OTrate;
	}
	public int getOTrate() {
		return OTrate;
	}
}
public class Company {

	public static void main(String[] args) {
		PartTime pt1 = new PartTime("Samarth",1,1000,2,500);
		FullTimeE ft1 = new FullTimeE("Tejas",2,500,40000,1000);
		System.out.println("Salary of pt1 is: "+ CalculateSalary(pt1));
		System.out.println("Salary of ft1 is: "+ CalculateSalary(ft1));

	}
	public static int CalculateSalary(PartTime pt1) {
		return pt1.getHrs() * pt1.getOTrate()*30;
	}
	public static int CalculateSalary(FullTimeE ft1) {
		return ft1.getSalary() + ft1.getBenefits(); 
	}

}
