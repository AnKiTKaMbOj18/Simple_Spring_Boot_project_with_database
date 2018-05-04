package kamboj.ankit.SpringBootDemoProject.Products;

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

import kamboj.ankit.SpringBootDemoProject.Products.Products;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductsService productsService;
	
	@GetMapping("/")
	public List<Products> getAllProducts(){
		return productsService.getAllProducts();
	}
	
	@GetMapping("/{pid}")
	public Products getProduct(@PathVariable Long pid) {
		return productsService.getProduct(pid);
	}
	
	@PostMapping
	public Long addProduct(@RequestBody Products products) {
		return productsService.addProduct(products);
	}
	
	@PutMapping("/{pid}")
	public String updateProduct(@RequestBody Products products,@PathVariable Long pid) {
		return productsService.updateProduct(products);
	}
	
	@DeleteMapping("/{pid}")
	public String deleteProduct(@PathVariable Long pid) {
		return productsService.deleteProduct(pid);
	}

}
