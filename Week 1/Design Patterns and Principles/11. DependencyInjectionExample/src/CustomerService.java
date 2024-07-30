// Step 4

public class CustomerService
{
	private CustomerRepository customerRepository;

    // Constructor for Dependency Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }
}
