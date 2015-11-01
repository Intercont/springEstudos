package br.com.igor.repository;

import java.util.List;

import br.com.igor.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}