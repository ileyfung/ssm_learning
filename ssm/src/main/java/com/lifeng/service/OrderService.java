package com.lifeng.service;

import com.lifeng.pojo.Door;
import com.lifeng.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
	//查询所有订单
	List<Order> findAll();
	//新增订单
	void orderAdd(Order order);
	//根据id删除订单
	void orderDelete(Integer id);
	//根据id查询订单
	Order orderInfo(Integer id);
	//根据id更新订单
	void orderUpdate(Order order);
	//查询所有门店
	List<Door> doors();
}
