import java.util.Scanner;
public class Methods {
	Scanner sc=new Scanner(System.in);
	TaskNode head;
	
	// Step - 3 
	// Let N denote the size of the linked list
	
	// To add a new Node to the Linked List
	// Time Complexity : O(N)
	void add()
	{
		System.out.println("Enter the details of the New Task : ");
		TaskNode temp=new TaskNode();
		System.out.println("Enter the Task Id = ");
		temp.task.taskId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Task Name = ");
		temp.task.taskName=sc.nextLine();
		System.out.println("Enter the Task Status = ");
		temp.task.status=sc.nextLine();
		if(head==null)head=temp;
		else
		{
			TaskNode curr=head;
			while(curr.next!=null)curr=curr.next;
			curr.next=temp;
		}
	}
	
	// To search by Task Name in the Linked List
	// Time Complexity : O(N)
	void search()
	{
		System.out.println("Enter the Task Name which you want to search : ");
		String taskName=sc.nextLine();
		if(head==null)
		{
			System.out.println("No Task Exist");
			return;
		}
		TaskNode temp=head;
		while(temp!=null)
		{
			if(temp.task.taskName.equals(taskName))
			{
				System.out.println("Found : The Task Exist in the List.");
				return;
			}
		}
		System.out.println("Not Found : The Task does not exist in the List.");
	}
	
	// To traverse the Linked List
	// Time Complexity : O(N)
	void traverse()
	{
		TaskNode temp=head;
		System.out.println("The Traversal of the Task Linked List is : ");
		while(temp!=null)
		{
			System.out.print("[ "+temp.task.taskId+" "+temp.task.taskName+" "+temp.task.status+" ]  ->  ");
			temp=temp.next;
		}
		System.out.print(" null");
		System.out.println();
	}
	
	// To Delete according to the Task Name
	// Time Complexity : O(N)
	void delete()
	{
		System.out.println("Enter the Task Name which you want to delete : ");
		String taskName=sc.nextLine();
		if(head==null)
		{
			System.out.println("No Task Exist : No deletion Possible");
			return;
		}
		else if(head.next==null && head.task.taskName==taskName)
		{
			head=head.next;
			System.out.println("Deletion Succesfull : Deleted the node with the name "+taskName+" from the Linked List");
			return;
		}
		else
		{
			TaskNode curr = head;
	        while (curr.next != null)
	        {
	        	
	        }
		}
	}

}
