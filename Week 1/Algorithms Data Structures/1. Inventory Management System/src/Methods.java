import java.util.HashMap;
import java.util.Scanner;
public class Methods 
{
	// Step 3
	
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Product> map;
	
	public Methods()
	{
		map=new HashMap<Integer,Product>();
	}
	
	// Method to add a new Product
	// Time Complexity : O(1)
	void addProduct()
	{
		System.out.println("Enter the Product Id : ");
		int id=sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter the Product Name : ");
		String name=sc.nextLine();
		System.out.println("Enter the Product Quantity : ");
		int quantity=sc.nextInt();
		System.out.println("Enter the Product Price : ");
		double price=sc.nextDouble();
		sc.nextLine(); 
		if(map.containsKey(id))
		{
			System.out.println("Invalid Product Id Entered : Two Product can't have same Id's");
			return;
		}
		else
		{
			Product temp=new Product();
			temp.productId=id;
			temp.productName=name;
			temp.quantity=quantity;
			temp.price=price;
			map.put(id, temp);
		}
	}
	
	// Method to update the existing Product
	// Time Complexity : O(1)
	void updateProduct()
	{
		// Edge Case
		if(map.size()==0)
		{
			System.out.println("Updation Not Possible : No Product found in the inventory.");
			return;
		}
		System.out.println("Enter the updated Details of the Existing Product : ");
		System.out.println("Enter the Product Id : ");
		int id=sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter the Product Name : ");
		String name=sc.nextLine();
		System.out.println("Enter the Product Quantity : ");
		int quantity=sc.nextInt();
		System.out.println("Enter the Product Price : ");
		double price=sc.nextDouble();
		Product temp=new Product();
		temp.productId=id;
		temp.productName=name;
		temp.quantity=quantity;
		temp.price=price;
		if (map.containsKey(id))
		{
			map.put(id,temp);
			System.out.println("Product with Id "+id+" updated successfully from the inventory ");
		}
	    else System.out.println("Product not found in the inventory.");
	}
	
	// Method to delete the Product by Product Id
	// Time Complexity : O(1)
	void deleteProduct()
	{
		// Edge Case
		if(map.size()==0)
		{
			System.out.println("Deletion Not Possible : No Product found in the inventory.");
			return;
		}
		System.out.println("Enter the Product Id which you want to delete from the inventory : ");
		int id=sc.nextInt();
		if (map.containsKey(id))
		{
			map.remove(id);
			System.out.println("Product with Id "+id+" deleted successfully from the inventory ");
		}
	    else System.out.println("Product not found in the inventory.");     
	}
}
