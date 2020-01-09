package com.harshita.ecom.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.harshita.ecom.entities.Customer;
import com.harshita.ecom.repository.CustomerRepository;
import com.harshita.ecom.repository.OrderRepository;
import com.harshita.ecom.repository.ProductRepository;
@Service
public class CustomerService {

	
	@Autowired
	CustomerRepository custRepo;
	@Autowired
	OrderRepository orderRepo;
	@Autowired
	ProductRepository prodRepo;
	
	@PersistenceContext
	EntityManager em;
	
	public Customer createCustomer(Customer customer) {
		if(customer.getOrders()!=null && !customer.getOrders().isEmpty()){
			customer.getOrders().stream().forEach(order -> order.setCustomer(customer));
		}
		return(custRepo.save(customer));
}
	public Customer getCustomer(int id) {
		//System.out.print(lname);
		//custRepo.getCustomersWithFilter(id);
		custRepo.findAll().stream().forEach(cust -> System.out.println(cust.getOrders()));
		Customer cust = em.createQuery("FROM Customer c WHERE c.id="+id, Customer.class).getSingleResult();
		//em.createNa
		System.out.println(cust);
		return cust;
		//return (List<String>) custRepo.findAll().stream().filter(customer-> customer.getId()==id).map(customer-> customer.getFirstname()).collect(Collectors.toList());
		
		}
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> cust= custRepo.findAll();
		return cust;
	}	
	
	
}
