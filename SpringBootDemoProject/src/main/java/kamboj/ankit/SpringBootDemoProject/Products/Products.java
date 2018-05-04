package kamboj.ankit.SpringBootDemoProject.Products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pid;
	private String pname;
	private Long pcost;

	public Products() {

	}

	public Products(Long pid, String pname, Long pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getPcost() {
		return pcost;
	}

	public void setPcost(Long pcost) {
		this.pcost = pcost;
	}

}
