
public class Test
{
	public static void main(String[] args)
	{
		// Step 5 
		Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Load and display image1
        System.out.println("First display call for Image 1 :");
        image1.display();
        System.out.println("Second display call for Image 2 :");
        image1.display();

        // Load and display image2
        System.out.println("First display call for Image 2 :");
        image2.display();
        System.out.println("Second display call for Image 2 :");
        image2.display();

	}
}
