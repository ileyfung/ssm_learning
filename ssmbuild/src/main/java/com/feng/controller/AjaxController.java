package com.feng.controller;

import com.feng.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    /*@RequestMapping("/t1")
    public String t1() {
        return "hello";
    }

    @RequestMapping("/t2")
    public void t2(String name, HttpServletResponse response) throws IOException {
        if ("admin".equals(name)) {
            response.getWriter().println("true");
        } else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/t3")
    public List<User> t3() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("feng", 22, "男"));
        userList.add(new User("jiang", 32, "男"));
        userList.add(new User("li", 12, "男"));
        return userList; //由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/t4")
    public String t4(String name,String pwd) {
        String msg = "";
        if (name != null) {
            if ("feng".equals(name)) {
                msg = "OK";
            } else msg = "用户名有误";
        }
        if (pwd != null) {
            if ("123".equals(pwd)) {
                msg = "OK";
            } else msg = "密码有误";
        }
        return msg;
    }*/
}
