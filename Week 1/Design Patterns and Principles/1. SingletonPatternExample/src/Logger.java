public class Logger
{
	// a variable to store the  instance of class
	private static Logger instance;
	private Logger()
	{
	}
	// public method to return the instance of Logger class
	public static Logger getInstance()
	{
		if(instance==null) instance=new Logger();
		return instance;
	}
}
