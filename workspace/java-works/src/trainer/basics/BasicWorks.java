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
	
	// if condition 
	private static void large3numbers() {
		int num1 = 100; 
		int num2 = 20;
		int num3 = 555; 
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Num 1 is Largest ");
		}else if (num2 > num3) {
			System.out.println("Num2 is largest");
		}else {
			System.out.println("Num3 is largest");
		}
	}

	// ternary condition 
	private static void large3numbers_ternary() {
		int num1 = 100; 
		int num2 = 20;
		int num3 = 555; 
	
		System.out.println(
				num1>num2 && num1 > num3 ? "Number 1 Is Large" : 
				num2>num3?"Number 2 Is Large":
				"Number 3 Is Large");
		
	}
	
	
	// Jan, Mar, May, Jul, Aug, Oct, Dec = 31 
	// Feb - 29, 28 
	// other - 30 
	
	
	private static int getTheMonthBasedOnNumber(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			return 31; 

		case 2: 
			return year%4==0 ? 29: 28; 
		default:
			return 30; 
		}
	}
	
	
	
}
