package com.harshita.ecom.entities;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Entity@Getter@Setter
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="my_seq_gen")
	Integer id; 
	@Column
	String name;
	@Column
	Integer price;

	@Column
	Integer quantityOrdered;



	@JsonIgnoreProperties({"products","customer"})

	@ManyToMany(mappedBy="products",cascade = CascadeType.MERGE)
	List<Order> orders;
	


	public Product(){
		StringBuilder b = new StringBuilder();
		b.append(5).insert(9,7).reverse();
	}


}
