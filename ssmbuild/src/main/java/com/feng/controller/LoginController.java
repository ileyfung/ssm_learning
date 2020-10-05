package com.feng.controller;

import com.feng.Util.AllUserInfo;
import com.feng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired AllUserInfo allUserInfo;

    @RequestMapping("/home")
    public String toHome() {
        return "home";
    }

    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }

    //判断用户登录
    @RequestMapping("/checkLogin")
    @ResponseBody
    public String[] checkLogin(String name, String pwd , HttpSession session) {
        String password = "";
        String[] results = new String[2];
        //从数据库中拿数据存入map中再在map拿用户数据，因为map查询非常快
        Map<String, String> usersMap = allUserInfo.UsersMap();
        if (name != null) { //不等于空表示用户已查到
            password = usersMap.get(name);
            if (password != null) {
                System.out.println(name + "  " + password);
                results[0]="OK";
            }else results[0]="用户不存在，请重新输入";
        }

        if (pwd != null) {
           /* System.out.println("===>  "+pwd  + ""+password);
            System.out.println("判断"+pwd.equals(password));*/
            if (pwd.equals(password)) { //这里只用判断密码是否正确就行
                results[1]="OK";
            } else if(password == null) {
                results[1]="用户名不存在，请重新输入！！！";
            } else results[1]="密码错误，请重新输入";
        }

        if (results[0] == "OK" && results[1] == "OK") {
            session.setAttribute("user",name);
        }
        return results;
    }

    //退出登陆
    @RequestMapping("/logout")
    public String logout(HttpSession session) throws Exception {
        // session 过期
        session.invalidate();
        return "login";
    }
}
