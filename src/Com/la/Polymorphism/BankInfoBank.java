package Com.la.Polymorphism;

public class BankInfoBank extends Bank {

	public static void main(String[] args) {

		BankInfoBank b = new BankInfoBank();
		b.personalLoan();
		b.eductionLonan();
		b.homeLoan();
	}

	@Override
	public
	void personalLoan() {
		System.out.println("12.5%");
	}

	@Override
	public void homeLoan() {
		System.out.println("8.5%");
		
	}

}
