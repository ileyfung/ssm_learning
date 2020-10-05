package com.lifeng.controller;

import com.lifeng.pojo.Door;
import com.lifeng.pojo.Order;
import com.lifeng.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {
	//自动装配
	@Autowired
	OrderService orderService;

	//更新
	@RequestMapping("/orderUpdate")
	public String orderUpdate(Order order) {
		orderService.orderUpdate(order);
		return "forward:orderList";
	}

	//根据id查询订单信息，查询所有门店，并带数据返回到更新订单页面
	@RequestMapping("/orderInfo")
	public String orderInfo(Model model,Integer id) {
		Order order = orderService.orderInfo(id);
		List<Door> doors = orderService.doors();
		model.addAttribute("order",order);
		model.addAttribute("doors", doors);
		return "order_update";
	}

	//新增订单
	@RequestMapping("/orderAdd")
	public String orderAdd(Order order) {
		orderService.orderAdd(order);
		return "forward:orderList";
	}

	//将门店信息带入新增页面
	@RequestMapping("/toOrderAdd")
	public String toOrderAdd(Model model) {
		List<Door> doors = orderService.doors();
		model.addAttribute("doors", doors);
		return "order_add";
	}

	//根据id删除订单
	@RequestMapping("/orderDelete")
	public String orderDelete(Integer id) {
		orderService.orderDelete(id);
		return "forward:orderList";
	}

	//查询所有订单
	@RequestMapping("/orderList")
	public String orderList(Model model) {
		List<Order> orders = orderService.findAll();
		List<Door> doors = orderService.doors();
		model.addAttribute("orders",orders);
		model.addAttribute("doors",doors);
		return "order_list";
	}
}
