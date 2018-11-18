package test;


interface Loan{
	void deposit();
	void withdraw();
}

class PersonalLaon implements Loan{

	@Override
	public void deposit() {
		
	}

	@Override
	public void withdraw() {
		
	}
	
}
class HomeLoan implements Loan{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Loan loan  = new HomeLoan();
		loan.deposit();
	}

}
