package com.example.demo.Customer;

import java.util.List;
import java.util.Optional;

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
	
	public void addCustomer(Customer customer)
	{
		 customerRepository.save(customer);
	}
	
	public Customer grs(String contactPhone,String userPassword)
	{
        Customer customer = customerRepository.find(contactPhone,userPassword).orElseThrow(() -> new IllegalStateException(""));
        return customer;
	
	}

	
}
 
