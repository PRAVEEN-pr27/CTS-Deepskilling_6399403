public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String customerId) {
        Customer customer = repository.findCustomerById(customerId);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
