// Step 6

public class Test
{
	public static void main(String[] args)
	{
		StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("Mobile App 1");
        Observer mobileApp2 = new MobileApp("Mobile App 2");
        Observer webApp1 = new WebApp("Web App 1");

        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        stockMarket.setStockPrice("MCKS", 150.00);
        stockMarket.setStockPrice("GGGL", 2800.00);

        stockMarket.deregister(mobileApp1);

        stockMarket.setStockPrice("FKRT", 3400.00);

	}
}
