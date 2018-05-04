package kamboj.ankit.SpringBootDemoProject.Customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	private CustomersService customersService;

	@GetMapping("/")
	public List<Customers> getAllCustomers(){
		return customersService.getAllCustomers();
	}
	
	@GetMapping("/{cid}")
	public Customers getCustomer(@PathVariable Long cid) {
		return customersService.getCustomer(cid);
	}
	
	@PostMapping
	public Long addCustomer(@RequestBody Customers customers) {
		return customersService.addCustomer(customers);
	}
	
	@PutMapping("/{cid}")
	public String updateCustomer(@RequestBody Customers customers,@PathVariable Long cid) {
		return customersService.updateCustomer(customers);
	}
	
	@DeleteMapping("/{cid}")
	public String  deleteCustomer(@PathVariable Long cid) {
		return customersService.deleteCustomer(cid);
	}
	
	
}
