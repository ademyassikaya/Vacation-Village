package com.example.demo.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	private final CustomerRepository customerRepository;
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	public List<Customer> getCustomer()
	{
		return customerRepository.findAll();
	}


	public void deleteCustomer(Long VacationVillageId) 
	{
		customerRepository.deleteById(VacationVillageId);

	}
	
	
	
}
 
