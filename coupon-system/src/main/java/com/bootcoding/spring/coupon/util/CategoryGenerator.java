package com.bootcoding.spring.coupon.util;

import java.util.Random;

public class CategoryGenerator {
    public static String randomCategory()
    {
        Random random= new Random();
        String category[]={"Fashion","Electronics","Travel & Leisure","Tech & Gadgets","Books & Stationery","Jewelry & Accessories","Entertainment"};
        int index= random.nextInt(category.length);
        return category[index];
    }
}
