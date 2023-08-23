package com.bootcoding.spring.coupon.util;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class TitleGenerator {
    public static String randomTitle()
    {
        String s[] ={"First order offer","Weekly deal","DiscountDelight"
                ,"Flash sale offer","PromoPerks2023","SaveMoreWave",
                "MegaSaverDeal","VoucherBoostX"};
        Random random = new Random();
        int index= random.nextInt(s.length);
        return s[index];
    }
}

