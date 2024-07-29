import java.util.Scanner;
public class Finance
{
	public static void main(String[] args)
	{
		// Step 1
		
		// Recursion is a programming technique where a method calls itself to solve a problem.
		// It simplifies problems by breaking them down into smaller subproblems of the same 
		// type. Each recursive call processes a smaller instance of the problem, converging 
		// towards a base case, which terminates the recursion.
		
		// Step 3
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Present Value : ");
		double pValue=sc.nextDouble();
		System.out.println("Enter the Growth Rate : ");
		double gRate=sc.nextDouble();
		System.out.println("Enter the Periods : ");
		double periods=sc.nextDouble();
		
		double fValue=calculateFutureValue(pValue,gRate,periods);
		System.out.println("The future value after " + periods + " periods is : " + fValue);
		
		// Step 4
		// Let N denote the number of Periods
		
		// The time complexity of the recursive algorithm is O(N)
		
		// To optimize the recursive solution to avoid excessive computation, especially for 
		// the problem of predicting future values based on past growth rates, we can employ 
		// techniques such as memoization and iterative approaches. 
		// For this problem the iterative approach is the optimal solution. It avoids 
		// excessive computation by eliminating the overhead of recursive calls and using a 
		// simple loop to achieve the same result efficiently.

	}
	// Step 2
	
	// Method to calculate future value using Recursion
	public static double calculateFutureValue(double presentValue, double growthRate, double periods)
	{
       // Base Case
       if (periods == 0) return presentValue;
       return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }
}
