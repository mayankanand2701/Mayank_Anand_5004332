
public class PhonePayAdapter implements PaymentProcessor
{
    private PhonePay phonepay;
    
	public PhonePayAdapter(PhonePay phonepay)
	{
		this.phonepay=phonepay;
	}
	@Override
	public void processPayment(double amount) {
		phonepay.phonePayPayment(amount);	
	}
}
