package training.day2;

public class EmployeeImpl {
	public static void main(String[] args) {
		
		Runtime.runFinalizersOnExit(true);
		
		Employee emp = new Employee(); 
		
		emp.setEmpId(101);
		emp.setEmpName("Anu");
		emp.setEmpSal(4000);
		
		// emp.display();
//		System.out.println("Emp Id : " + emp.getEmpId());
//		System.out.println("Emp Name : " + emp.getEmpName());
		
		System.out.println(emp); // -> emp.toString();
	}
}