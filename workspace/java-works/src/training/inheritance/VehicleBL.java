package training.inheritance;

public class VehicleBL {
	public void showVehicle(Vehicle vehicle) {
		System.out.println("+++++++++++++++++++");
		vehicle.move(); 
		vehicle.stop();
		
		((FourWheeler)vehicle).fuelCapacity();
		
		if(vehicle instanceof BMW) {
			((BMW)vehicle).autoSteering();
		} else if(vehicle instanceof Maruti) {
			((Maruti) vehicle).abs(); 
		}
	}
}