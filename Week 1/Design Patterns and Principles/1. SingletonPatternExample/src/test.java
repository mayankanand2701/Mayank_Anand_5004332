// Step 4
public class test
{
	public static void main(String[] args)
	{
		// to call the instance of Logger class using different variables
		Logger obj1=Logger.getInstance();
		Logger obj2=Logger.getInstance();
		
		// to check whether they refer to same reference or not
		if(obj1==obj2)System.out.println("Singleton Pattern : All object refer to same reference.");
		else System.out.println("Not a Singleton pattern.");
	}
}
