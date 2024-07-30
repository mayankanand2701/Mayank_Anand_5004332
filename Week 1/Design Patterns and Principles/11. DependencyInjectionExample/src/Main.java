// Step 6
public class Main
{
	public static void main(String[] args)
	{
		CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // To inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // To use the service to find a customer
        Customer customer = customerService.getCustomerById(1);

        // To display the customer information
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());

	}
}
