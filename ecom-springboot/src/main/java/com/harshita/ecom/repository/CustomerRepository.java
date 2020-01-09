package com.harshita.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.harshita.ecom.entities.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("FROM Customer c left join c.orders WHERE c.id = 2")
	public  Customer getCustomersWithFilter(int id);
	
	public Customer getCustomerByFirstname(String name);
}
