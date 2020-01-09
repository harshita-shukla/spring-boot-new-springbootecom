package com.harshita.ecom;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.harshita.ecom.entities.Customer;
import com.harshita.ecom.repository.CustomerRepository;
import com.harshita.ecom.services.CustomerService;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class CustControllerTest 
    extends TestCase
{
  @InjectMocks
   CustomerService custSer;
  @Mock
  CustomerRepository custRepo;
  
  
  
  @org.junit.Test
  public void testCreateCustomer() {
	  Customer customer= new Customer();
	  customer.setFirstname("Harshita");
	 Mockito.when(custRepo.save(Mockito.any(Customer.class))).thenReturn(customer);
	Customer custres= custSer.createCustomer(customer);
	
	 assertEquals("Harshita", custres.getFirstname());
	  }
    
}
