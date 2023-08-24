package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class DiscountGenerator {
    public static double discount()
    {
        Random random= new Random();
        double max=85.40;
        double min=15;
        return random.nextDouble(max-min);
    }
}
