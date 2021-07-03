package JavaPart3;

public class TestBank {

	public static void main(String[] args) {

		SMIBank sbi = new SMIBank();
		sbi.moneytranfer();
		sbi.credit();
		sbi.debit();
		sbi.CarLoan();
		sbi.EducationLoan();
		sbi.OnlineBank();

		// Dynamic Poylimorphism
		// Child class object is referred to parent interface reference variable
		IndianBank in = new SMIBank();
		in.credit();
		in.debit();
		in.moneytranfer();
		System.out.println("MinBalance is: " + IndianBank.MinBal);

	}

}
