package bankapplication1.exception;

public class LowBalanceException  extends Exception {
	
	
	int amount;

	int balance;

	public LowBalanceException(int amount, int balance) {

		this.amount=amount;

		this.balance=balance;

	}

	public String errorMsg()

	{

		return "Insufficient balance,available balance="+balance;

	}
	
	

}
