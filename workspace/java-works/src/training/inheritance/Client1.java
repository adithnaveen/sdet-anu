package training.inheritance;

public class Client1 {
	public static void main(String[] args) {
		 
		Vehicle [] vehicles = new Vehicle[5]; 
		vehicles[0] = new BMW(); 
		vehicles[1] = new Maruti();
		vehicles[2] = new BMW(); 
		vehicles[3] = new Maruti();
		vehicles[4] = new BMW();
		
		VehicleBL vbl = new VehicleBL(); 
		
		for(Vehicle temp : vehicles) {
			vbl.showVehicle(temp);
		}
		
	}
}
