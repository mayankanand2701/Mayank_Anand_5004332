// Step 3

public class CreditCardPayment implements PaymentStrategy
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid amount " + amount + " using Credit Card.");	
	}
}
