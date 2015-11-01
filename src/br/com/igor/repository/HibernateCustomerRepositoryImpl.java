package br.com.igor.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.igor.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see br.com.igor.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer igor = new Customer();
		
		igor.setFirstName("Igor");
		igor.setLastName("Fraga");
		
		customers.add(igor);		
		
		return customers;
	}
}
