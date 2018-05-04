package kamboj.ankit.SpringBootDemoProject.Products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	public List<Products> getAllProducts() {
		List<Products> products = new ArrayList<>();
		productsRepository.findAll().forEach(products::add);
		return products;
	}

	public Products getProduct(Long pid) {
		return productsRepository.findOne(pid);
	}

	public Long addProduct(Products products) {
		productsRepository.save(products);
		return products.getPid();
	}

	public String updateProduct(Products products) {
		productsRepository.save(products);
		return "updated";
	}

	public String deleteProduct(Long pId) {
		productsRepository.delete(pId);
		return null;
	}
	
}
