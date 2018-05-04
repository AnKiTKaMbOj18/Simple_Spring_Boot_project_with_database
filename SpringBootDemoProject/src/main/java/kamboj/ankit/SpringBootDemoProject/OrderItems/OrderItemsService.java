package kamboj.ankit.SpringBootDemoProject.OrderItems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderItemsService {
	
	
	@Autowired
	private OrderItemsRepository orderItemsRepository;
	
	public List<OrderItems> getAllOrderItems() {
		List<OrderItems> orderitems=new ArrayList<OrderItems>();
		orderItemsRepository.findAll()
		.forEach(orderitems::add);
		return orderitems;
	}

	public OrderItems getOrderItem(int oiid) {
		return orderItemsRepository.findOne(oiid);
	}

	public Long addOrderItem(OrderItems orderitems) {
		orderItemsRepository.save(orderitems);
		return orderitems.getOiid();
	}

	public String updateOrderItem(OrderItems orderitems) {
		orderItemsRepository.save(orderitems);
		return "updated";
	}

	public String deleteOrderItem(int oiid) {
		orderItemsRepository.delete(oiid);
		return "deleted";
	}



}
