// Step 4
public class SMSNotifierDecorator extends NotifierDecorator
{

	public SMSNotifierDecorator(Notifier notifier) 
	{
		super(notifier);
	}
	 @Override
	 public void send(String message)
	 {
	     super.send(message);
	     sendSlackMessage(message);
	 }

	 private void sendSlackMessage(String message)
	 {
	      System.out.println("Sending Slack message: " + message);
	 }
}
