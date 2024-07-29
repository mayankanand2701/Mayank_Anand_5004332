public class Main
{
	public static void main(String[] args)
	{
		Methods ll=new Methods();
		ll.addProduct();
		ll.addProduct();
		ll.addProduct();
		ll.deleteProduct();
		ll.deleteProduct();
		ll.updateProduct();
		ll.deleteProduct();
		ll.updateProduct();
		
		// Step 4
		
		// Time Complexity of addProduct() Method is O(1)
		// Time Complexity of deleteProduct() Method is O(1)
		// Time Complexity of updateProduct() Method is O(1)
		
		// By choosing the right data structure and analyzing the operations, 
		// we can efficiently manage the inventory system, ensuring quick access and 
		// modifications even with large datasets.
		
		// However the method we have used is most efficient approach as it used constant
		// time for performine each opeartions.
	}
}
