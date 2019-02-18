package mockingWithMockito2_tests;

import java.util.HashMap;
import java.util.Map;

import mockingWithMockito2.Customer;
import mockingWithMockito2.CustomerRepository;

public class CustomerRepositoryStub extends CustomerRepository {
	
	private Map<Integer, Customer> customerList = new HashMap<Integer, Customer>();
	
	@Override
	public void add(Customer customer) {
		customerList.put(customer.getCustomerId(), customer);
	}
	
	@Override
	public void delete(Integer customerId) {
		customerList.remove(customerId);
	}

	
	@Override
	public Customer find(Integer customerId) {
		return customerList.get(customerId);
	}

	public Map<Integer, Customer> getCustomerList() {
		return customerList;
	}

	public void deleteEverything() {
		customerList.clear();
	}
	
	
	
}
