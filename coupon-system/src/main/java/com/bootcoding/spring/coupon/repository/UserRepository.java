package com.bootcoding.spring.coupon.repository;

import com.bootcoding.spring.coupon.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void save(User user){
        System.out.println("User has been inserted into database");
    }
}
