package oop;

public class Toyota extends ModernCar implements Car, Motor {

	//Car Interface
	public void start() {
		System.out.println("lets drive the car");
		
	}


	public void stop() {
		System.out.println("Have a break system to stop the car");
		
	}


	public void carshape() {
		System.out.println("shape should not be more than 6 feet long and 4 feet wide");
		
	}
	
	// Toyota Class
	public void bodyColor() {
		System.out.println("car has multiple colors");
	}
	
	//Motor Interface
	public void engine() {
		System.out.println("car run by motor engine");
		
	}
	
	public void fuelType() {
		System.out.println("car run by motor engine");
	}
	
	public void hydraulicBreak() {
		System.out.println("This car has hydraulic break");
	}
}

