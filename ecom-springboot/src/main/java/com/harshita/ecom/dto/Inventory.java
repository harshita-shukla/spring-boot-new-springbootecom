package com.harshita.ecom.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Inventory {
   int id;
    int productid;
    int prodquantity;

    public Inventory(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProdquantity() {
        return prodquantity;
    }

    public void setProdquantity(int prodquantity) {
        this.prodquantity = prodquantity;
    }
}
