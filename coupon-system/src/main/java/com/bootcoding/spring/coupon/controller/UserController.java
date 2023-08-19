package com.bootcoding.spring.coupon.controller;

import com.bootcoding.spring.coupon.model.User;
import com.bootcoding.spring.coupon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public String register(@RequestBody List<User> users){
        userService.saveUser(users);
        return "SUCCESS";
    }


    // 2.2 Get Coupon Details by Coupon Id using PathVariable
//    @GetMapping("user/{id}")
//    public User getUser(@PathVariable("id") int id){
//        User user = userService.getUser(id);
//        return user;
//    }
//    @GetMapping("user")
//    public List<User> getAllUsers(){
//        List<User> users = userService.getUsers();
//        return users;
//    }
}
