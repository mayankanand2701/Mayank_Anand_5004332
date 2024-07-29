import java.util.Arrays;
import java.util.Scanner;
public class Methods
{
	Scanner sc=new Scanner(System.in);
	Product[] arr;
	int size;
	
	// Constructor for the basic input
	public Methods()
	{
		System.out.println("Enter the number of Products whose details you want to store : ");
		size=sc.nextInt();
		arr=new Product[size];
		sc.nextLine(); 
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Product Id : ");
			int id=sc.nextInt();
			sc.nextLine(); 
			System.out.println("Enter the Product Name : ");
			String name=sc.nextLine();
			System.out.println("Enter the Procuct Category : ");
			String category=sc.nextLine();
			Product temp=new Product();
			temp.productId=id;
			temp.productName=name;
			temp.category=category;
			arr[i]=temp;
		}
	}
	
	// Step 3
	
	// Method to implement the Linear Search
	// Time Complexity :
	void linerSearch()
	{
		// Edge Case
		if(size==0)
		{
			System.out.println("Searching not Possible : Array is Empty.");
			return;
		}
		System.out.println("Enter the Product Name which you want to get searched : ");
		String name=sc.nextLine();
		boolean found = false;
        for (int i = 0; i < size; i++)
        {
            if (arr[i].productName.equals(name))
            {
                System.out.println("Product with name " +name+" found in the Array. ");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Product with name " +name+" not found in the Array. ");
	}
	
	// Method to implement the Linear Search
	// Time Complexity :
	void binarySearch()
	{
		// Edge Case
		if(size==0)
		{
			System.out.println("Searching not Possible : Array is Empty.");
			return;
		}
		System.out.println("Enter the Product Name which you want to get searched : ");
		String name=sc.nextLine();
		
		Arrays.sort(arr, (a, b) -> a.productName.compareTo(b.productName)); 
        int left = 0;
	    int right = size - 1;
	    boolean found = false;
	    while (left <= right)
	    {
	    	int mid = left + (right - left) / 2;
	        int value = arr[mid].productName.compareTo(name);
	        if (value == 0)
	        {
	            System.out.println("Product with name " +name+" found in the Array. ");
	            found = true;
	            break;
	        } 
	        else if (value < 0) left = mid + 1;
	        else right = mid - 1;
	     }
	    if (!found)System.out.println("Product with name " + name + " not found.");   
	}
}
