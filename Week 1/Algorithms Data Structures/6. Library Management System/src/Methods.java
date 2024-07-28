import java.util.Scanner;
public class Methods
{
	// Step - 3
	// Let N denote the size of the array
	
	Scanner sc=new Scanner(System.in);
	Book[] arr;
	int size;
	
	// Constructor to take the required Input
	public Methods()
	{
		System.out.println("Enter the number of books whose details you want to store : ");
		size=sc.nextInt();
		arr=new Book[size];
		sc.nextLine(); 
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Book Id : ");
			int id=sc.nextInt();
			sc.nextLine(); 
			System.out.println("Enter the Title of the Book : ");
			String title=sc.nextLine();
			System.out.println("Enter the Author of the Book : ");
			String author=sc.nextLine();
			Book temp=new Book();
			temp.bookId=id;
			temp.title=title;
			temp.author=author;
			arr[i]=temp;
		}
	}
	
	// Method to implement Linear Search
	// Time Complexity : O(N)
	void linerSearchByTitle()
	{
		System.out.println("Enter the Book Title to be Searched in the List :  ");
		String title=sc.nextLine();
		boolean found=false;
		for(int i=0;i<size;i++)
		{
			if(arr[i].title.equals(title))
			{
				System.out.println("Book with the Title '"+title+"' Found in the List ");
				found=true;
				return;
			}
		}
		if(!found) System.out.println("Book with the Title '"+title+"' does not exist in the List");
	}
	
	// Method to implement Binary Search
	// Time Complexity : O(log N)
	void binarySearchByTitle()
	{
		System.out.println("Enter the Book Title to be Searched in the List : ");
        String title = sc.nextLine();
		int left = 0;
        int right = size - 1;
        boolean found = false;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            int result = arr[mid].title.compareTo(title);
            if (result == 0)
            {
                System.out.println("Book with the Title '" + title + "' Found in the List ");
                found = true;
                break;
            } 
            else if (result<0) left = mid + 1;
            else right = mid - 1;
        }
        if (!found) System.out.println("Book with the Title '" + title + "' does not exist in the List");
	}
}
