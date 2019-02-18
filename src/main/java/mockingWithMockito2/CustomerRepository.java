package mockingWithMockito2;

public class CustomerRepository {
	
	public void add(Customer customer) {
		System.out.println("Customer Added.");
	}
	
	public void delete(Integer customerId) {
		System.out.println("Customer Deleted.");
	}

	public Customer find(Integer customerId) {
		System.out.println("Find method.");
		return null;
	}
}
