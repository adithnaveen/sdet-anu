package training.inheritance;

public abstract class FourWheeler extends Vehicle {
	public FourWheeler() {
		super();
		System.out.println("Four Wheeler Created... ");
	}
	
	public void fuelCapacity() {
		System.out.println("Every car has fuel capacity");
	}
	
}
