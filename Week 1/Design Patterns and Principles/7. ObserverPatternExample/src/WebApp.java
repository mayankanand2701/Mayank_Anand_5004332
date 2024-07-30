// Step 5

public class WebApp implements Observer
{
	 private String name;

	 public WebApp(String name)
	 {
		 this.name = name;
	 }

	 @Override
	 public void update(String stockSymbol, double stockPrice)
	 {
		 System.out.println(name + " received stock update : " + stockSymbol + " is now $" + stockPrice);
	 }
}
