package com.harshita.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.harshita.ecom.entities.Customer;
import com.harshita.ecom.entities.Order;
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
