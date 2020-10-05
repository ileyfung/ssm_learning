package com.lifeng.controller;

import com.lifeng.pojo.Door;
import com.lifeng.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//门店信息控制器
@Controller
public class DoorController {

	//自动注入(由spring创建mapper对象并为属性赋值)
	@Autowired
	DoorService doorService;
	//根据id更新doorUpdate
	@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door) {
		//调用业务层
		doorService.doorUpdate(door);
		return "redirect:doorList";
	}

	//根据id查询门店
	@RequestMapping("/doorInfo")
	public String doorInfo(Model model,Integer id) {
		//根据id查询
		Door door = doorService.doorInfo(id);
		//将查询到的门店信息带入编辑信息的页面
		model.addAttribute("door",door);
		return "door_update";
	}

	//根据id删除门店
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id) {
		doorService.doorDelete(id);
		return "forward:doorList";
	}

	//新增门店
	@RequestMapping("/doorAdd")
	public String doorAdd(Door door) {
		doorService.doorAdd(door);
		return "forward:doorList";
	}

	//查询所有门店信息
	@RequestMapping("/doorList")
	public String doorList(Model model) {
		//调用业务类返回门店信息列表
		List<Door> doors = doorService.findAll();
		//将列表带入jsp页面
		model.addAttribute("doors",doors);
		return "door_list";
	}

	//通用页面转发
	@RequestMapping("/{pages}")
	public String pages(@PathVariable String pages) {
		System.out.println(pages);
		return pages;
	}
}
