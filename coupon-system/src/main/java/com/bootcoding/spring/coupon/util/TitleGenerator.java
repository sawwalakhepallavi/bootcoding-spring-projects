package com.bootcoding.spring.coupon.util;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class TitleGenerator {
    public static String randomTitle()
    {
        String title[] ={"First order offer","Weekly deal","DiscountDelight"
                ,"Flash sale offer","PromoPerks2023","SaveMoreWave",
                "MegaSaverDeal","VoucherBoostX"};
        Random random = new Random();
        int index= random.nextInt(title.length);
        return title[index];
    }
}

