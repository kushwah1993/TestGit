package java8_Assignment;

public class Hell {
	
	int age;
	String name;
	
	Hell(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	boolean show() {
		if(true) {
			return true;
		}
		return false;	
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		return false;
		
	}
	
	public static void main(String args[]) {
		
		Hell obj1 = new Hell(12," abc");
		Hell obj2 = new Hell(12," abc");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
	}
	
}
