package kamboj.ankit.SpringBootDemoProject.OrderItems;

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
@RequestMapping("/orderitems")
public class OrderItemsController {
	
	@Autowired
	private OrderItemsService orderItemsService;
	
	@GetMapping("/")
	public List<OrderItems> getAllOrderItems(){
		return orderItemsService.getAllOrderItems();
	}
	
	@GetMapping("/{oiid}")
	public OrderItems getOrderItem(@PathVariable int oiid) {
		return orderItemsService.getOrderItem(oiid);
	}
	
	@PostMapping
	public Long addOrderItem(@RequestBody OrderItems orderitems) {
		return orderItemsService.addOrderItem(orderitems);
	}
	
	@PutMapping("/{oiid}")
	public String updateOrderItem(@RequestBody OrderItems orderitems,@PathVariable int oiid) {
		return orderItemsService.updateOrderItem(orderitems);
	}
	
	@DeleteMapping("/{oiid}")
	public String  deleteOrderItem(@PathVariable int oiid) {
		return orderItemsService.deleteOrderItem(oiid);
	}

}
