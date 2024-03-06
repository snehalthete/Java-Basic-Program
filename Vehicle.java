package st;

 class VehicleDriver {
	    public void drive() {
	        System.out.println("Driving a vehicle");
	    }
	}

	class Car extends Vehicle {
	    @Override
	    public void drive() {
	        System.out.println("Repairing a car");
	    }
	}

	public class Vehicle {
	    public static void main(String[] args) {
	        VehicleDriver vehicle = new VehicleDriver();
	        vehicle.drive(); // Output: Driving a vehicle
	        
	        Car car = new Car();
	        car.drive(); // Output: Repairing a car
	    }

		public void drive() {
			// TODO Auto-generated method stub
			
		}
	}


