public class Main
{
	public static void main(String[] args)
	{
		Methods list=new Methods();
		list.linerSearchByTitle();
		list.binarySearchByTitle();
		
		// Step  4
		// Let N denote the size of the array
		
		// Time Complexity of Linear Search is O(N)
		// Time Complexity of Binary Search is O(log N)
		
		// When to use which sorting algorithm
		
		// Linear Search
		// 1. When the dataset size is small.
		// 2. When data is not sorted .
		// 3. When the data structure does not support efficient random access ( like linked list).
		
		// Binary Search
		// 1. When the dataset is sorted.
		// 2. When the dataset is large.
		// 3. When you need to perform multiple searches on the same dataset.	
		
	}
}
