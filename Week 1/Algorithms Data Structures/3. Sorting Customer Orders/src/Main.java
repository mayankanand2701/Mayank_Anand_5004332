public class Main
{
	public static void main(String[] args)
	{
		Methods obj=new Methods();
		obj.bubbleSort();
		obj.printOrders();
		
		Methods obj1=new Methods();
		obj1.quickSort();
		obj1.printOrders();
		
		// Step 4
		
		// Time Complexity of Bubble Sort is  O(n^2)
		// Time Complexity of Quick Sort is  O(n log n) on average, O(n^2) in the worst case.
		
		// Why Quick Sort is generally preferred over Bubble Sort.
		
		// Quick Sort's superior time complexity, practical performance, and efficiency in 
		// handling large datasets make it the preferred choice over Bubble Sort for most 
		// sorting tasks.

	}
}
