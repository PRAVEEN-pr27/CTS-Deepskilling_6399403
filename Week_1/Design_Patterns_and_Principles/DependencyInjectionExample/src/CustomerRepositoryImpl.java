public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String customerId) {

        System.out.println("Fetching customer from database...");
        return new Customer(customerId, "John Doe");
    }
}
