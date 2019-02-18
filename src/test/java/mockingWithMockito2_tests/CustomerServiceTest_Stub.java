package mockingWithMockito2_tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mockingWithMockito2.Customer;
import mockingWithMockito2.CustomerRepository;
import mockingWithMockito2.CustomerService;
import mockingWithMockito2.InformationService;

public class CustomerServiceTest_Stub {

	private CustomerService customerService;
	private CustomerRepositoryStub customerRepository = new CustomerRepositoryStub();;
	private InformationService informationService;
	
	@Before
	public void setUp() {
		customerService = new CustomerService();
		informationService = Mockito.mock(InformationService.class);
		customerService.setCustomerRepository(customerRepository);
		customerService.setInformationService(informationService);
	}
	
	@After
	public void after() {
		customerRepository.deleteEverything();
	}
	
	@Test
	public void addCustomerTest() {
		Customer customer = new Customer(1234);
		
		customerService.addCustomer(customer);
	
		assertEquals(customer, customerRepository.find(customer.getCustomerId()));
		Mockito.verify(informationService).sentMail(customer);
			
	}
	
	@Test
	public void deleteCustomerTest() {
		customerService.addCustomer(new Customer(1234));
		customerService.deleteCustomer(1234);
		assertNull(customerRepository.find(1234));
	}
	
	
	

}
