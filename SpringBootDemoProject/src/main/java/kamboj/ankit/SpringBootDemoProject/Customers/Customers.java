package kamboj.ankit.SpringBootDemoProject.Customers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kamboj.ankit.SpringBootDemoProject.Orders.Order;

@Entity
@Table(name="customers")
public class Customers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cid;
	private String cname;

	@OneToMany(mappedBy = "customers")
	public List<Order> order=new ArrayList<>();

	public Customers() {

	}

	public Customers(Long cid, String cname, List<Order> order) {

		this.cid = cid;
		this.cname = cname;
		this.order = order;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
