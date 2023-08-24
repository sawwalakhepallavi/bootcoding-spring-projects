package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class CreatedBy {
    public static String randomCreator()
    {
        Random random= new Random();
        String[] creator={"Amazon","Flipkart","Meesho","IndiaMart","PhonePay","Paytm","GooglePay","Zomato","Swiggy"};
        int index=random.nextInt(creator.length);
        return creator[index];
    }
}
