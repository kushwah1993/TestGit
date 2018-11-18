package java8_Assignment;

import java.util.ArrayList;
import java.util.Iterator;
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
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1,1000,"ABC","Add"));
		employee.add(new Employee(1,1500,"PQR","Add"));
		employee.add(new Employee(1,2000,"XYZ","Add"));
		
		Iterator<Employee> itr=employee.iterator();  
		while(itr.hasNext()){
			Employee emp = (Employee)itr.next();
			System.out.println(emp.id+" "+emp.name+" "+emp.address+" "+emp.sal);
		}
		
	}

}

