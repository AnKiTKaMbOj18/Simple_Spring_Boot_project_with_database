package kamboj.ankit.SpringBootDemoProject.OrderItems;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kamboj.ankit.SpringBootDemoProject.Orders.Order;
import kamboj.ankit.SpringBootDemoProject.Products.Products;

@Entity
@Table(name="orderitems")
public class OrderItems {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long oiid;

	@OneToOne
	@JoinColumn(name="pid")
	public Products products; 

	@ManyToOne
	@JoinColumn(name="oid")
	public Order order;

	public OrderItems() {

	}

	public OrderItems(Long oiid, Products products, Order order) {
		super();
		this.oiid = oiid;
		this.products = products;
		this.order = order;
	}

	public Long getOiid() {
		return oiid;
	}

	public void setOiid(Long oiid) {
		this.oiid = oiid;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

}
