package com.lifeng.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testspringmvc {
	@RequestMapping("/hello") //浏览器访问的路径
	public String hello() {
		return "hello"; //响应浏览器的页面
	}
}
