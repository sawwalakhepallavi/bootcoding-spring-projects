package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class CouponStatusGenerator {
    public static String randomStatus() {
        String[] status = {"Active", "Expired", "Upcoming", "Redeemed"};
        Random random = new Random();
        int index = random.nextInt(status.length);
        return status[index];
    }
}
