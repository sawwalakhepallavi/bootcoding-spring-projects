package com.bootcoding.spring.coupon.service;

import com.bootcoding.spring.coupon.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {

    @Autowired
    private CouponHelper couponHelper;

    public CouponService(CouponHelper couponHelper){
        this.couponHelper = couponHelper;
    }

    public String newCoupon(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> coupons = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newCoupon = newCoupon();
            coupons.add(newCoupon);
        }
        return coupons;

    }

    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .type("COUPON")
                .build();
        return coupon;
    }
}
