// Step 5

public class MobileApp implements Observer
{
	 private String name;

	 public MobileApp(String name)
	 {
	        this.name = name;
	 }

	 @Override
	 public void update(String stockSymbol, double stockPrice)
	 {
		 System.out.println(name + " received stock update : " + stockSymbol + " is now $" + stockPrice);
	 }
}
