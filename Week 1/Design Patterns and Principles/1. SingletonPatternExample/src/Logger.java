// Step 1 
// Already create a new Java project named SingletonPatternExample

// Step 2 

public class Logger
{
	// a variable to store the  instance of class
	private static Logger instance;
	private Logger()
	{
	}
	
	// Step 3
	
	// public method to return the instance of Logger class
	public static Logger getInstance()
	{
		if(instance==null) instance=new Logger();
		return instance;
	}
}
