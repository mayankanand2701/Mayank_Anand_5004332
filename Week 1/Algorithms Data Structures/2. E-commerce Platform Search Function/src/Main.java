public class Main
{
	public static void main(String[] args)
	{
		Methods ll=new Methods();
		ll.linerSearch();
		
		Methods ll1=new Methods();
		ll1.binarySearch();
		
		// Step 4
		
		// Time Complexity of Linear Search is O(N)
		// Time Complexity of Binary Search is O(log N)
		
		// Linear Search
		// 1.Suitable for small datasets or unsorted arrays.
		// 2.Easier to implement and doesn't require sorting.
		
		// Binary Search
		// 1.More suitable for large datasets where the array is sorted.
		// 2.Provides faster search times compared to linear search.

	}
}
