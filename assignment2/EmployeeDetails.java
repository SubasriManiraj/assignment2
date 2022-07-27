package assignment2;

public class EmployeeDetails {
	public void printEmployeeName(String EmployeeName ) {
		System.out.println("Employee Name-"+EmployeeName);
	}
	public void printEmployeeId(int EmployeeId) {
		System.out.println("Employee ID-"+EmployeeId);
	}
	public void printEmployeeAddress(String EmployeeAddress) {
		System.out.println("Employee Address-"+EmployeeAddress);
	}
	public void printEmployeeSalary(double EmployeeSalary) {
		System.out.println("Employee Salary-"+EmployeeSalary);
	}
	public void printEmployeeMobNumber(long EmployeeMobNumber) {
		System.out.println("Employee Mobile Number-"+EmployeeMobNumber);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("Suba");
		emp.printEmployeeId(19);
		emp.printEmployeeAddress("Thiruvarur");
		emp.printEmployeeSalary(30000.00);
		emp.printEmployeeMobNumber(9003792877L);
		emp.printEmployeeName("Sri");
		emp.printEmployeeId(9);
		emp.printEmployeeAddress("Chennai");
		emp.printEmployeeSalary(45000.00);
		emp.printEmployeeMobNumber(9751192121L);
		
		
	}
}
