package training.day2;
 
// extends Object 
public class Employee {
	private int empId; 
	private String empName; 
	private double empSal; 
	
	Employee() {
		System.out.println("Object created... ");
	}
	
	// getters and setters 
	
	public void setEmpId(int id) {
		// can you write conditions 
		empId = id; 
	}
	
	public int getEmpId() {
		return this.empId; 
	}
	
	public void setEmpName(String name) {
		if(name.length() < 3) {
			System.out.println("Sorry Invalid Name");
			empName = "No Name"; 
		}else 
			empName = name; 
	}
	
	public String getEmpName() {
		return this.empName; 
	}
	
	public void setEmpSal(double empSal) {
		if(empSal < 3000) {
			this.empSal = 3000; 
		}else {
			this.empSal = empSal;
		}
	}
	
	public double getEmpSal() {
		return this.empSal; 
	}
	
	public void display() {
		System.out.println("Emp Id: " + this.empId);
		System.out.println("Emp Name: " + this.empName);
		System.out.println("Emp Sal: " + this.empSal);
	}

	
	public String toString() {
		return this.empId +", " + 
			   this.empName +", " + 
			   this.empSal; 
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruction Of Object Happens Here...");
	}
	
}
