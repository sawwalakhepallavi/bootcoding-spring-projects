package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class TypeGenerator {
    public static  String type()
    {
        Random random= new Random();
        String couponType[]= {"BuyOneGetOne","FreeShipping","FirstPurchase","SeasonalPromo","EndOfSeason","PercentOff"};
        int index= random.nextInt(couponType.length);
        return couponType[index];
    }
}
