// Step 3

import java.util.ArrayList;
import java.util.List;
public class StockMarket implements Stock 
{
	 private List<Observer> list;
	 private String stockSymbol;
	 private double stockPrice;

	 public StockMarket()
	 {
		 this.list = new ArrayList<>();
	 }

	 public void setStockPrice(String stockSymbol, double stockPrice)
	 {
	        this.stockSymbol = stockSymbol;
	        this.stockPrice = stockPrice;
	        notifyO();
	 }

	 @Override
	 public void register(Observer observer)
	 {
		 list.add(observer);
	 }

	 @Override
	 public void deregister(Observer observer)
	 {
		 list.remove(observer);
	 }
	 
	 @Override
	 public void notifyO()
	 {
		 for (Observer observer : list) observer.update(stockSymbol, stockPrice);
	 }
}
