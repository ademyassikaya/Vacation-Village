package com.example.demo.Customer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface CustomerRepository 
extends JpaRepository<Customer, Long> 
{
	@Query("SELECT C FROM Customer C WHERE C.ContactPhone = ?1 AND C.UserPassword = ?2")
    Optional<Customer> find(String ContactPhone,String UserPassword);
}
