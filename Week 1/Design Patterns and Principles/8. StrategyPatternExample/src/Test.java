// Step 5

public class Test
{
	public static void main(String[] args) 
	{
		 PaymentContext context = new PaymentContext();

	     // Paying with Credit Card
	     PaymentStrategy creditCardPayment = new CreditCardPayment();
	     context.setPaymentStrategy(creditCardPayment);
	     context.executePayment(100.00);

	     // Paying with PayPal
	     PaymentStrategy payPalPayment = new PayPalPayment();
	     context.setPaymentStrategy(payPalPayment);
	     context.executePayment(200.00);

	}
}
