package kamboj.ankit.SpringBootDemoProject.Orders;

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

import kamboj.ankit.SpringBootDemoProject.dto.OrderDto;



@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{oid}")
	public Order getOrder(@PathVariable Long oid) {
		return orderService.getOrder(oid);
	}
	
	@PostMapping
	public Long addOrder(@RequestBody OrderDto orderDto) {
		return orderService.addOrder(orderDto);
	}
	
	@PutMapping("/{oid}")
	public String updateOrder(@RequestBody Order order,@PathVariable Long oid) {
		return orderService.updateOrder(order);
	}
	
	@DeleteMapping("/{oid}")
	public String  deleteOrder(@PathVariable Long oid) {
		return orderService.deleteOrder(oid);
	}
	
}
