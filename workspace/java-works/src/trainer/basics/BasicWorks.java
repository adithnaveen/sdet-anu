package trainer.basics;

public class BasicWorks {
	public static void main(String[] args) {
		
		// large2numbers();
		
		// evenSeries();
		
		// oddSeries();
		
	 
	
	}

	private static void oddSeries() {
		// oddseries 
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
	}

	private static void evenSeries() {
		int upperLimit = 10; 
		int lowerLimit = 0; 
		// to show even series 
		while(lowerLimit <= upperLimit) {
			System.out.println(lowerLimit);
			
			lowerLimit +=2;  // lowerLimit = lowerLimit + 2; 
		}
	}

	private static void large2numbers() {
		int num1 = 100; 
		int num2 = 20;
		
		if(num1 > num2) {
			System.out.println("Num1 Is Largest");
		}else {
			System.out.println("Num2 Is Largest");
		}
	}
	
	private static void large3numbers() {
		int num1 = 100; 
		int num2 = 20;
		int num3 = 555; 
		
	}
	
}
