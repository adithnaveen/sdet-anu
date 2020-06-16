package training.inheritance;

public class BMW extends FourWheeler{
	public BMW() {
		super();
		System.out.println("BMW Car created...");
	}

	@Override
	public void move() {
		System.out.println("BMW Is Moving...");
	}
	
	public void autoSteering() {
		System.out.println("BMW comes with auto steering... ");
	}
	
}
