
public class CredicardPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Pay by credit card: " + amount);

	}

}
