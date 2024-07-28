import java.util.Scanner;
public class Methods
{
	// Step 3 
	
	Scanner sc=new Scanner(System.in);
	Employee[] arr;
	int size;
	
	// Constructor to initialize the values 
	public Methods()
	{
		System.out.println("Enter the number of Employees whose details you want to store : ");
		size=sc.nextInt();
		arr=new Employee[size];
	}
	
	// Method to add details of each Employee
	// Time Complexity : O(N)
	void add()
	{
		System.out.println("Kindly Enter the Detials of "+size+" Employee's ");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Employee Id : ");
			int id=sc.nextInt();
			sc.nextLine(); 
			System.out.println("Enter the Employee Name : ");
			String name=sc.nextLine();
			System.out.println("Enter the Employee Postion : ");
			String position=sc.nextLine();
			System.out.println("Enter the Employee Salary : ");
			double salary=sc.nextDouble();
			Employee temp=new Employee();
			temp.employeeId=id;
			temp.name=name;
			temp.position=position;
			temp.salary=salary;
			arr[i]=temp;
		}
	}
	
	// Method to search by Employee Name
	// Time Complexity : O(N)
	void search()
	{
		System.out.println("Enter the Employee Name to be Searched in the Array :  ");
		sc.nextLine();
		String name=sc.nextLine();
		boolean found=false;
		for(int i=0;i<size;i++)
		{
			if(arr[i].name.equals(name))
			{
				System.out.println("Employee with the Name '"+name+"' Found in the Array. ");
				found=true;
				return;
			}
		}
		if(!found) System.out.println("Employee with the Name '"+name+"' does not exist in the Array.");
	}
	
	// Method to traverse the entire Employee Array
	// Time Complexity : O(N)
	void traverse()
	{
		System.out.println("The Detilas of all the Employees in the Array are : ");
		for(int i=0;i<size;i++)
		{
			Employee temp=arr[i];
			System.out.println("[ The EmployeeID is "+temp.employeeId+" having name "+temp.name+" holding postion "+temp.position+" and the salary is "+temp.salary +" ] ");
		}
	}
	
	// Method to delete Employee form the Employee Array by Employee Name
	// Time Complexity : O(N)
	void delete()
	{
		 System.out.println("Enter the Employee Name to be Deleted from the Array: ");
	     sc.nextLine();  
	     String name = sc.nextLine();
	     int index = -1;
	     for (int i = 0; i < size; i++)
	     {
	         if (arr[i].name.equals(name))
	         {
	        	 index = i;
	             break;
	         }
	     }
	     if (index == -1)
	     {
	    	 System.out.println("Employee with the Name '" + name + "' does not exist in the Array.");
	         return;
	     }
	     for (int i = index; i < size - 1; i++) arr[i] = arr[i + 1];
	     arr[size - 1] = null; 
	     size--;
	     System.out.println("Employee with the Name '" + name + "' has been deleted from the Array.");
	}
}
