package com.bootcoding.spring.coupon.repository;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
