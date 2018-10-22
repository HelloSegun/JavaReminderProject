
public class EmployeeTest {

	public static void main(String args[]) {
		Employee empOne = new Employee("TomTom");
		Employee empTwo = new Employee("SatNav");
		
		empOne.setSalary(1000);
		empOne.printEmp();
		
		empTwo.setSalary(2000);
		empTwo.printEmp();
	}
}
