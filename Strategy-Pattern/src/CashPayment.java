
public class CashPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Pay by cash: " + amount);

	}

}
