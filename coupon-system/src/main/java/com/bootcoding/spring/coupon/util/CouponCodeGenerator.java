package com.bootcoding.spring.coupon.util;

import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class CouponCodeGenerator {
    public static String randomCouponCode(){
        UUID uuid=UUID.randomUUID();
        return uuid.toString().replace("-","").substring(0,10);

    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(randomCouponCode());
//        }
//    }
}
