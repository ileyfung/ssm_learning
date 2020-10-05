package com.lifeng.service;

import com.lifeng.dao.OrderMapper;
import com.lifeng.pojo.Door;
import com.lifeng.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderMapper orderMapper;

	public List<Order> findAll() {
		return orderMapper.findAll();
	}

	public void orderAdd(Order order) {
		orderMapper.orderAdd(order);
	}

	public void orderDelete(Integer id) {
		orderMapper.orderDelete(id);
	}

	public Order orderInfo(Integer id) {
		return orderMapper.orderInfo(id);
	}

	public void orderUpdate(Order order) {
		orderMapper.orderUpdate(order);
	}

	public List<Door> doors() {
		return orderMapper.doors();
	}
}
