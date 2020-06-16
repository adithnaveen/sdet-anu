package training.inheritance;

public class Maruti extends FourWheeler {
	public Maruti() {
		System.out.println("Maruti Car Created... ");
	}

	@Override
	public void move() {
		System.out.println("Maruti is moving... ");
	}

	@Override
	public void stop() {
		System.out.println("Maruti car stops...");
	}
	
	public void abs() {
		System.out.println("Maruti has ABS...");
	}

	
}
