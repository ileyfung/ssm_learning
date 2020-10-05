package com.lifeng.controller;

import com.lifeng.pojo.User;
import com.lifeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String login(Model model,User user) {
		List<User> all = userService.findAll();
		for (User u : all) {
			if (u.getName().equals(user.getName())){
				if (u.getPwd().equals(user.getPwd())) {
					return "index";
				} else {
					System.out.println("密码错误");
					model.addAttribute("error","密码错误");
				}
			} else {
				System.out.println("用户错误");
				model.addAttribute("error","用户名或密码错误");
			}
		}
		return "login";
	}

}
