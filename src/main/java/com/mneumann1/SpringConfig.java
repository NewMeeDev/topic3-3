package com.mneumann1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.mneumann1.service.OrderBusinesService;
import com.mneumann1.service.OrderBusinesServiceInterface;

@Configuration
public class SpringConfig {

	@Bean(name="orderBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	//@SessionScope
	public OrderBusinesServiceInterface getOrderBusines() {
		return new OrderBusinesService();
	}
}
