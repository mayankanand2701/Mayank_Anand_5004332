// Step 3

public class PayPalPayment implements PaymentStrategy
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid amount " + amount + " using PayPal.");
	}
}
