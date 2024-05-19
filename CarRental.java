//check Rental.java file for interface
//24. Develop a vehicle rental system where customers can rent different types of vehicles. 
//Define an interface called Rentable with methods like rent(), returnVehicle(), and calculateRentalCost().
//Implement this interface in classes representing different types of vehicles such as Car, Motorcycle, and Bicycle. 
//Create a rental manager class to handle the renting and returning of vehicles.
//package Lab;
package Lab;
import java.util.*;
class Car implements Rental{
	private boolean rented;
	private final double cost;
	public Car(double cost) {
		this.cost=cost;
		this.rented=false;
	}
	

	@Override
	public void rent() {
		if(!rented) {
			rented= true;
			System.out.println("car rented");
			
		}else {
			System.out.println("car already on rent");
		}
	}

	@Override
	public void returnVehicle() {
			if(rented) {
				rented=false;
				System.out.println("car returned");
			}else {
				System.out.println("car was not rented");
			}
	}

	@Override
	public double calculateRentalCost(int rentalduration) {
		
		return rentalduration * cost;
	}
	
}
class MotorCycle implements Rental{
	private boolean rented ;
	private double cost;
	public MotorCycle (double cost) {
		this.cost=cost;
		this.rented=false;
	}
	@Override
	public void rent() {
		if(!rented) {
			rented=true;
			System.out.println("Motor cycle has been rented");
		}
		else {
			System.out.println("motor cycle already on rent");
		}
	}
	@Override
	public void returnVehicle() {
		if(rented) {
			rented=false;
			System.out.println("Motor cycle returned");
		}else {
			System.out.println("Motor cycle was not rented ");
		}
	}
	public double calculateRentalCost(int rentalduration ) {
		return cost * rentalduration;
	}
	
}
 class Bicycle implements Rental{
	 private boolean rented;
	 private double cost;
	 public Bicycle(double cost) {
		 this.rented=false;
		 this.cost=cost;
	 }
	@Override
	public void rent() {
		if(!rented) {
			rented=true;
			System.out.println("Bicycle has been rented");
			
		}else {
			System.out.println("Bicycle already rented");
		}
		
	}
	@Override
	public void returnVehicle() {
		if(rented) {
			rented=false;
			System.out.println("Bicycle has been returned");
		}else {
			System.out.println("Bicycle is already rented");
		}
	}
	@Override
	public double calculateRentalCost(int rentalduration) {
	
		return cost * rentalduration;
	}
	 
 }
public class CarRental {
	private final List<Rental> rentedVehicles;
	public CarRental() {
		this.rentedVehicles = new ArrayList<>();
	}
	public void rentvehicle(Rental vehicle) {
		vehicle.rent();
		if(!rentedVehicles.contains(vehicle)) {
			rentedVehicles.add(vehicle);
		}
	}
	public void renturnVehicle(Rental vehicle) {
		vehicle.returnVehicle();
		rentedVehicles.remove(vehicle);
		
	}
	public double calculatecost() {
		double totalCost=0.0;
		//on rent for one day
		for(Rental vehicle: rentedVehicles) {
			totalCost += vehicle.calculateRentalCost(1);
		}
		return totalCost;
	}
	public static void main(String[] args) {
			CarRental admin = new CarRental();
			Rental car = new Car(50);
			Rental motorcycle = new MotorCycle(30);
			Rental bicycle = new Bicycle(10);
			admin.rentvehicle(car);
			admin.rentvehicle(bicycle);
			admin.rentvehicle(motorcycle);
			System.out.println("Total rental cost: "+admin.calculatecost());
			admin.renturnVehicle(bicycle);
			admin.renturnVehicle(car);
			admin.renturnVehicle(motorcycle);
			
			
	}

}
