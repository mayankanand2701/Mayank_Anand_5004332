// Step 5

public class test
{
	public static void main(String[] args)
	{
		Notifier notifier = new EmailNotifier();
        notifier.send("Initial Notification");
        System.out.println("------------------------------------------------");
        System.out.println("Adding SMS notification :");
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("Notification with Email and SMS");
        System.out.println("------------------------------------------------");
        System.out.println("Adding Slack notification :");
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("Notification with Email, SMS, and Slack");
        System.out.println("------------------------------------------------");
	}
}
