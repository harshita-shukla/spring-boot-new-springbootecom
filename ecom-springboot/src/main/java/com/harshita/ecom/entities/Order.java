package com.harshita.ecom.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

@Entity//@Getter@Setter
@Table(name="custorder")
public class Order {

	public Order() {

	}
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="my_seq_gen")
	 Integer id;
	
	@Column
	 String quantity;
	
	 @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	 @JsonIgnoreProperties("orders")
	// @JsonManagedReference
	//@JsonBackReference

	 @JoinColumn(name="cust_id",nullable=false)
	 Customer customer;
	 
	 @ManyToMany(cascade = CascadeType.MERGE)
	 @JoinTable(
			 name = "custorder_product", joinColumns = {@JoinColumn (name ="order_id")},
			 inverseJoinColumns = {@JoinColumn (name = "product_id")}
			 )
	 List<Product> products;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

