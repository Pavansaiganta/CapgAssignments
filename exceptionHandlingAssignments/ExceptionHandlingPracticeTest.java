package exceptionHandlingAssignments;

public class ExceptionHandlingPracticeTest {

	public static void main(String[] args) {
		// TOCustomer c;
		Customer c;
		try {
			 c= new Customer("Pavan", 10000);
			int amount=3000;
			boolean paymentStatus=c.makePayment(amount);
			if(paymentStatus) {
				System.out.println("payment Successfull "+c.getBalance());
			}
			else {
				System.out.println("payment failed");
			}
		} catch (InvalidValidUserNameException | InvalidBalanceAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
