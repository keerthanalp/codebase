package com.Lulu.ReturnProducts_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DamagedProduct")
public class DamagedProducts {
	@Id
	int id;
	String product_name ;
	String reasontoreturn;
	String customer_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getReasontoreturn() {
		return reasontoreturn;
	}
	public void setReasontoreturn(String reasontoreturn) {
		this.reasontoreturn = reasontoreturn;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Override
	public String toString() {
		return "DamagedProducts [id=" + id + ", product_name=" + product_name + ", reasontoreturn=" + reasontoreturn
				+ ", customer_name=" + customer_name + "]";
	}
	public DamagedProducts(int id, String product_name, String reasontoreturn, String customer_name) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.reasontoreturn = reasontoreturn;
		this.customer_name = customer_name;
	}
	public DamagedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
