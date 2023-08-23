package com.bootcoding.spring.coupon.util;

import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class CouponCodeGenerator {
    public static String randomCouponCode(){
        UUID uuid=UUID.randomUUID();
        return uuid.toString();
    }
}
