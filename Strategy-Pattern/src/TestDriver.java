
public class TestDriver {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		
		cart1.checkout(2500);
		cart1.seyPaymentStrategy(new CredicardPayment());
		cart1.checkout(2000);
		cart1.seyPaymentStrategy(new ScanPayment());
		cart1.checkout(1500);
	}

}
