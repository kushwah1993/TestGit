package java8_Assignment;

interface Piano{
	default void play() {
		System.out.println("sdjfas");
	}
}
interface Guitar{
	default void play() {
		System.out.println("fsfasd");
	}
}


public class Assignment2 implements Piano, Guitar{

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		obj.play();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		Guitar.super.play();
	}

}
