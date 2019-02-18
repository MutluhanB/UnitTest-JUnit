package mockingWithMockito2_tests;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mockingWithMockito2.Customer;
import mockingWithMockito2.CustomerRepository;
import mockingWithMockito2.CustomerService;
import mockingWithMockito2.InformationService;

public class CustomerServiceTest_Mock {

	private CustomerService customerService;
	private CustomerRepository customerRepository;
	private InformationService informationService;
	
	@Before
	public void setUp() {
		customerService = new CustomerService();
		customerRepository = Mockito.mock(CustomerRepository.class);
		informationService = Mockito.mock(InformationService.class);
		customerService.setCustomerRepository(customerRepository);
		customerService.setInformationService(informationService);
	}
	
	@Test
	public void addCustomerTest() {
		Customer customer = new Customer(1234);
		
		customerService.addCustomer(customer);
	
		Mockito.verify(informationService).sentMail(customer);
		Mockito.verify(customerRepository).add(customer);
	}
	

}
