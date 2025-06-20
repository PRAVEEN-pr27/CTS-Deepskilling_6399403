public class Main {
    public static void main(String[] args) {
       
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Use service
        service.displayCustomer("CUST2024");
    }
}
