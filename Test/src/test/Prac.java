package test;


class A{
	int i=1;
	static A obj = new A();
	private A() {
		
	}
	static public A getInstance() {
		return obj;
		
	}
	
}

public class Prac {
	public static void main(String args[]) {
		
		A obj = A.getInstance();
		System.out.println(obj.i++);
		A obj1 = A.getInstance();
		System.out.println(obj.i++);
	}
	
}
