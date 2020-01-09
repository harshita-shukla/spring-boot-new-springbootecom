package com.harshita.ecom.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
//@NamedQueries
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="my_seq_gen")
	Integer id;
	
	@Column
	String firstname;
	@Column
	String lastname;
	@Column
	String street;
	@Column
	String zipcode;
	//@JsonIgnoreProperties("customer")
	//@JsonBackReference
	//@JsonManagedReference(value = "customer")

	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	//@JoinColumn(name="cust_id")

	List<Order> orders;
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", street=" + street
				+ ", zipcode=" + zipcode + ", orders=" + orders + "]";
	}
	public Customer() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
