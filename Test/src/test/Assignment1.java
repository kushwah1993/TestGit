package test;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	double sal;
	String name;
	String address;
	public Employee(int id, double sal, String name, String address) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.address = address;
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,1000,"ABC","Add");
		Employee emp2 = new Employee(2,2000,"PQR","Add");
		Employee emp3 = new Employee(3,3000,"XYZ","Add");
		List<Employee> employeeList = new ArrayList<Employee>();	
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);	
		
		employeeList.forEach(employee -> System.out.println(employee.id+" "+employee.name+" "+employee.sal+" "+employee.address));  
		
		

		employeeList.sort((h1, h2) -> h1.name.compareTo(h2.name));
		
		System.out.println("After compare:");
		employeeList.forEach(employee -> System.out.println(employee.id+" "+employee.name+" "+employee.sal+" "+employee.address));
	}

}
