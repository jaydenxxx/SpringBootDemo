package com.yangxi.springproject.controller;

import com.yangxi.springproject.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> users =Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public String postUser(@ModelAttribute User user){
//        user.put(user.getID(), user);
//        return user.get(id);
//    }
}
