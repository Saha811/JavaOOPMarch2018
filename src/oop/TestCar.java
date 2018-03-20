package oop;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.carshape();
		car.start();
		
		Toyota corrola = new Toyota ();
		corrola.bodyColor();
		
		Motor motor = new Toyota();
		motor.engine();

		ModernCar modernCar = new Toyota();
		modernCar.hydraulicBreak();
		
		Car bmwCar = new BMW();
			bmwCar.start();
		
	}

}
