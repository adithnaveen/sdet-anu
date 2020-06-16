package training.inheritance;

public abstract class Vehicle {

	public Vehicle() {
		super();
		System.out.println("Vehicle Created...");
	}
	
	public abstract void move();
	public void stop() {
		System.out.println("Vehicle stop...");
	}
}
