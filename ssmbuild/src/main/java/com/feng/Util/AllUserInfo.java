package com.feng.Util;

import com.feng.dao.UserMapper;
import com.feng.pojo.User;
import com.feng.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AllUserInfo {
    @Autowired
    private  UserMapper Usermapper;

    public  void setUsermapper(UserMapper usermapper) {
        Usermapper = usermapper;
    }

    public Map<String,String> UsersMap() {
        Map<String,String> map = new HashMap<>();
        for (User user : Usermapper.allUser()) {
            map.put(user.getUsername(),user.getPassword());
        }
        return map;
    }
}
