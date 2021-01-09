package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public interface OrderManagementService {

	void addOrder(Order order);
	
	Order[] getOrderByUserId(int uderId);
	
	Order[] getOrders(); 
}
