package kamboj.ankit.SpringBootDemoProject.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

	private Long customerId;
	private List<OrderItemDto> orderItems = new ArrayList<>();

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public List<OrderItemDto> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemDto> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "OrderDto [customerId=" + customerId + ", orderItems=" + orderItems + "]";
	}

}
