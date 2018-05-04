package kamboj.ankit.SpringBootDemoProject.Customers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {
	@Autowired
	private CustomersRepository customersRepository;

	public List<Customers> getAllCustomers() {
		List<Customers> customers=new ArrayList<Customers>();
		customersRepository.findAll()
		.forEach(customers::add);
		return customers;
	}

	public Customers getCustomer(Long cid) {
		return customersRepository.findOne(cid);
	}

	public Long addCustomer(Customers customers) {
		customersRepository.save(customers);
		return customers.getCid();
	}

	public String updateCustomer(Customers customers) {
		customersRepository.save(customers);
		return "updated";
	}

	public String deleteCustomer(Long cid) {
		customersRepository.delete(cid);
		return "deleted";
	}

}
