package kamboj.ankit.SpringBootDemoProject.Orders;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kamboj.ankit.SpringBootDemoProject.Customers.Customers;
import kamboj.ankit.SpringBootDemoProject.OrderItems.OrderItems;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long oid;

	@ManyToOne
	@JoinColumn(name="cid")
	public Customers customers;

	@OneToMany(mappedBy = "order",cascade={CascadeType.ALL})
	public List<OrderItems> oitems=new ArrayList<>();

	public Order() {

	}

	public Order(Long oid, Customers customers, List<OrderItems> oitems) {
		
		this.oid = oid;
		this.customers = customers;
		this.oitems = oitems;
	}
	

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public List<OrderItems> getOitems() {
		return oitems;
	}

	public void setOitems(List<OrderItems> oitems) {
		this.oitems = oitems;
	}

}
