import java.util.Scanner;
public class Methods
{
	Scanner sc=new Scanner(System.in);
	int size;
	Order arr[];
	
	// Constructors to initialize the values
	public Methods()
	{
		System.out.println("Enter the number of Orders whose details you want to store : ");
		size=sc.nextInt();
		arr=new Order[size];
		sc.nextLine(); 
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Order Id : ");
			int id=sc.nextInt();
			sc.nextLine(); 
			System.out.println("Enter the Customer Name : ");
			String name=sc.nextLine();
			System.out.println("Enter the Total Price : ");
			double price=sc.nextDouble();
			Order temp=new Order();
			temp.orderId=id;
			temp.customerName=name;
			temp.totalPrice=price;
			arr[i]=temp;
		}
	}
	
	// Step 3
	
	// Method to implement Bubble Sort by Total Price
	// Time Complexity : O(n^2) 
	void bubbleSort()
	{
		// Edge Case
		if(size==0)
		{
			System.out.println("Sorting not Possible : Array is Empty.");
			return;
		}
		for (int i = 0; i < size - 1; i++)
		{
            for (int j = 0; j < size - i - 1; j++)
            {
                if (arr[j].totalPrice > arr[j + 1].totalPrice)
                {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort completed. Orders sorted by Total Price.");
	}
	
	// Method to implement Quick Sort by Total Price
	// Time Complexity :  O(n log n) on average, O(n^2) in the worst case.
	void quickSort()
	{
		// Edge Case
		if(size==0)
		{
			System.out.println("Sorting not Possible : Array is Empty.");
			return;
		}
		quickSortHelper(0, size - 1);
        System.out.println("Quick Sort completed. Orders sorted by Total Price.");
	}
	 private void quickSortHelper(int low, int high) 
	 {
	        if (low < high) 
	        {
	            int pi = partition(low, high);
	            quickSortHelper(low, pi - 1);
	            quickSortHelper(pi + 1, high);
	        }
	  }
	 private int partition(int low, int high)
	 {
	        double pivot = arr[high].totalPrice;
	        int i = (low - 1); 
	        for (int j = low; j < high; j++)
	        {
	            if (arr[j].totalPrice <= pivot)
	            {
	                i++;
	                Order temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        Order temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	  }
	 
	 void printOrders()
	 {
	        for (Order order : arr) System.out.println("Order ID: " + order.orderId + ", Customer Name: " + order.customerName + ", Total Price: " + order.totalPrice);
	        System.out.println();
	 }
}

