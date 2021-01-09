package com.itbulls.LearnIT.Ostapchuk.onlinestore;


public class DefaultOrderManagementService implements OrderManagementService {
	
	private static final int DEFOLT_ORDER_CAPACITY = 10;
	
	private static DefaultOrderManagementService instance;
	private int lastIndex;
	private Order[] orders;
	{
		orders = new Order[DEFOLT_ORDER_CAPACITY];
	}
	public static OrderManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		if(order == null) {
			return;
		}
		orders[lastIndex++] = order;
	}

	@Override
	public Order[] getOrderByUserId(int userId) {
		// TODO Auto-generated method stub
		int amountOfUserOrders = 0;
		for (Order order : orders) {
			if(order != null && order.getCustomerId() == userId) {
				amountOfUserOrders++;
			}
		}
		Order[] userOrders = new Order[amountOfUserOrders];
		int index = 0;
		for(Order order : orders) {
			if (order != null && order.getCustomerId() == userId) {
				userOrders[index++] = order;
			}
		}
		return userOrders;
	}

	@Override
	public Order[] getOrders() {
	int nonNullOrderAmount = 0;
	for(Order order : orders) {
		if (order != null) {
			nonNullOrderAmount++;
		}
	}
	Order[] nonNullOrders = new Order[nonNullOrderAmount];
	int index = 0;
	for(Order order : orders) {
		if (order != null) {
			nonNullOrders[index++] = order;
		}
	}
	return nonNullOrders;
	}
	void clearServiceState() {
		lastIndex = 0;
		orders = new Order[DEFOLT_ORDER_CAPACITY];
	}
}
