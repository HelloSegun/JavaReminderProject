
public class Employee {

	public String name;
	private double salary;
	
	public Employee(String empName) {
		this.name = empName;
	}
	
	public void setSalary(double empSal) {
		salary = empSal;
	}
	
	public void printEmp() {
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}
	/*
	public static void main(String args[]) {
		Employee empOne = new Employee("TomTom");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
	*/
}
