package br.com.igor.service;

import java.util.List;

import br.com.igor.model.Customer;
import br.com.igor.repository.CustomerRepository;


/**
 * Camada de serviço
 * @author intercont
 *
 */
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	
	/**
	 * Construtor para Injeção de dependência do Spring (Constructor Injection)
	 * @param customerRepository
	 */
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	

	/* (non-Javadoc)
	 * @see br.com.igor.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	/**
	 * Setter sendo usado para injeção de dependência (Setter Injection)
	 * @param customerRepository
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
