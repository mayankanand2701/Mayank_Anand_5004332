public class Main
{
	public static void main(String[] args)
	{
		Methods ll=new Methods();
		ll.add();
		ll.add();
		ll.add();
		ll.traverse();
		ll.delete();
		ll.traverse();
		
		// Step - 4
		
		// The advantages of linked lists over arrays for dynamic data are the following :
		
		// 1. Linked List can easily grow and shrink in size by adding or removing nodes 
		//    without the need for reallocation or restructuring.Array requires predefined size. 
		//    Resizing of array involves creating a new array and copying elements, 
		//    which is costly in terms of time and memory.
		// 2. Insertions and deletions in Linked List can be performed in O(1) time if the pointer 
		//    to the node is known where  Insertions and deletions require shifting elements,
		//    which can be O(n) in the worst case.
		// 3. Linked list elements can be stored anywhere in memory. This is beneficial when
		//    memory is fragmented.Array requires a large contiguous block of memory, which 
		//    can be problematic in systems with fragmented memory.
	}
}
