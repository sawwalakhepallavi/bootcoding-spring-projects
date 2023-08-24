package com.bootcoding.spring.coupon.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CreateDateGenerator {
    public static Date createDate()
    {
        Random random= new Random();
        Calendar calender = Calendar.getInstance();
        Date now = new Date();
        int daysToSubstract = -1 * random.nextInt(25);
        calender.setTime(now);
        calender.add(Calendar.DAY_OF_YEAR, daysToSubstract);
        Date yesterday = calender.getTime();
        return yesterday;
    }
    public static Date vaildDate()
    {
        Random random= new Random();
        Calendar calender = Calendar.getInstance();
        Date now = new Date();
        int daysToAdd = 1 * random.nextInt(25);
        calender.setTime(now);
        calender.add(Calendar.DAY_OF_YEAR, daysToAdd);
        Date yesterday = calender.getTime();
        return yesterday;
    }
    public static void main(String[] args) {
        System.out.println(vaildDate());
    }
}
