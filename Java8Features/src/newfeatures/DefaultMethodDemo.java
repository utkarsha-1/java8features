package newfeatures;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		Vehicle car=new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
		//Invoking static method
		System.out.println(Vehicle.getHorsePower(2500,400));

	}

}
