package JavaPart3;

public class SMIBank implements IndianBank,KarBank{

	public void credit() {
		System.out.println("----SBIBankCreditMethod-------");
	}

	public void debit() {
		System.out.println("-----SBIBankDebitMethod--------");

	}

	public void moneytranfer() {
		System.out.println("------SBIBankMoneyTranferMethod-------");

	}

	public void EducationLoan() {
		System.out.println("------SBIEducationLoan--------");
	}

	public void CarLoan() {
		System.out.println("------SMICarLoan----------");
	}
	public void OnlineBank() {
		System.out.println("-----KarBankOnlineBank-------");
	}

}
