package com.harshita.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.harshita.ecom.entities.Customer;
import com.harshita.ecom.entities.Order;
import com.harshita.ecom.entities.Product;
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
