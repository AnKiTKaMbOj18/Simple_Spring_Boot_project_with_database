package kamboj.ankit.SpringBootDemoProject.Orders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.SpringBootDemoProject.Customers.Customers;
import kamboj.ankit.SpringBootDemoProject.Customers.CustomersService;
import kamboj.ankit.SpringBootDemoProject.OrderItems.OrderItems;
import kamboj.ankit.SpringBootDemoProject.OrderItems.OrderItemsService;
import kamboj.ankit.SpringBootDemoProject.Products.Products;
import kamboj.ankit.SpringBootDemoProject.Products.ProductsService;
import kamboj.ankit.SpringBootDemoProject.dto.OrderDto;
import kamboj.ankit.SpringBootDemoProject.dto.OrderItemDto;



@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemsService orderItemsService;
	
	@Autowired
	private ProductsService productsService;
	
	@Autowired
	private CustomersService customersService;
	
	
	public List<Order> getAllOrders() {
		List<Order> order=new ArrayList<Order>();
		orderRepository.findAll()
		.forEach(order::add);
		return order;
	}

	public Order getOrder(Long oid) {
		return orderRepository.findOne(oid);
	}

	public Long addOrder(OrderDto orderDto) {

		Order order = new Order();
		
		List<OrderItems> items = new ArrayList<>();
		for (OrderItemDto orderItemDto : orderDto.getOrderItems()) {
			Products products = productsService.getProduct(orderItemDto.getProductId());
		  OrderItems orderItems = new OrderItems(null, products, order);
			items.add(orderItems);	

		}
		Customers customers = customersService.getCustomer(orderDto.getCustomerId());
		order.setCustomers(customers);
		  order.setOitems(items);
		
		orderRepository.save(order);
		return order.getOid();
	}

	public String updateOrder(Order order) {
		orderRepository.save(order);
		return "updated";
	}

	public String deleteOrder(Long oid) {
		orderRepository.delete(oid);
		return "deleted";
	}


}
