public class Main
{
	public static void main(String[] args)
	{
		Methods ll=new Methods();
		ll.add();
		ll.search();
		ll.traverse();
		ll.delete();
		ll.search();
		ll.traverse();
		
		// Step 4
		// Let N denote the size of the array
		
		// Time Complexity of Add Method is O(N)
		// Time Complexity of Search Method is O(N)
		// Time Complexity of Traverse Method is O(N)
		// Time Complexity of Delete Method is O(N)
		
		// Limitations of arrays :
		
		// 1.The size of an array is determined at the time of creation and cannot be changed.
		// 2.Arrays require a contiguous block of memory.
		// 3.Inserting or deleting elements from the middle of an array requires shifting other elements.
		// 4.Arrays do not provide built-in methods for common operations like resizing, searching, or sorting.
		
		// When to use Array :
		// 1.Use arrays when the number of elements is known in advance and does not change.
		// 2.It is suitable when you need contiguous memory allocation for elements.
		// 3.Arrays offer O(1) time complexity for accessing elements by index, making it
		//   suitable for performance-critical applications where fast access is essential.
	}
}
