package com.mneumann1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mneumann1.model.OrderModel;
import com.mneumann1.service.OrderBusinesServiceInterface;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderRestController {
	
	// dependency injection

	@Autowired
	OrderBusinesServiceInterface service;

	
	@GetMapping("/")
	public List<OrderModel> showAllOrders() {				
		List<OrderModel> orders = service.getOrders();	
		return orders;
	}
	
	
	@GetMapping("/{searchTerm}")
	public List<OrderModel> searchOrders(@PathVariable(name="searchTerm") String searchTerm) {				
		List<OrderModel> orders = service.searchOrders(searchTerm);	
		return orders;
	}
	
	
	
	
}
