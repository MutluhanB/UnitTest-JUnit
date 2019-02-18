package mockingWithMockito2;

public class CustomerService {

	private CustomerRepository customerRepository;
	private InformationService informationService;
	
	public void addCustomer(Customer customer) {
		customerRepository.add(customer);
		informationService.sentMail(customer);
	}
	
	public void deleteCustomer(Integer customerID) {
		customerRepository.delete(customerID);
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}
	
	
}
