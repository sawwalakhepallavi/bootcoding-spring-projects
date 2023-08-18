package com.bootcoding.spring.coupon.controller;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.model.User;
import com.bootcoding.spring.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/coupon/") // Global Mapping
public class CouponController {
    @Autowired
    private CouponService couponService;


    @PostMapping("register")
    public String register(@RequestBody List<User> users){
        boolean isSaved = couponService.save(users);
        System.out.println("Body: " + users);
        return "Success";
    }


    // 2.2 Get Coupon Details by Coupon Id using PathVariable
    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") int id){
        User user = couponService.getUser(id);
        return user;
    }
    @GetMapping("user")
    public List<User> getAllUsers(){
        List<User> users = couponService.getUsers();
        return users;
    }

    // 1. Get All Coupons
    @GetMapping("all-coupons")
    public List<String> getAllCoupons(){
        int quantity = 10;
        return couponService.getNewCoupon(quantity);
    }

    // 2. Get Coupon Details by Coupon Id using PathVariable
//    @GetMapping("coupon-id/{id}")
//    public String getCouponById(@PathVariable("id") String couponId){
//        return couponId + "-" + couponService.newCoupon();
//    }

    // 2.2 Get Coupon Details by Coupon Id using PathVariable
    @GetMapping("coupon-id/{id}")
    public Coupon getCouponObjectById(@PathVariable("id") String couponId){
        Coupon coupon = couponService.generateNewCoupon();
        return coupon;
    }

    @GetMapping("generate/new")
    public Coupon generateNewCoupon(){
        Coupon coupon = couponService.generateNewCoupon();
        return coupon;
    }
    // 3. Get Coupons with Filter (Query Parameter)
    @GetMapping("search_coupon")
    public String searchCoupon(
            @RequestParam("valid") boolean isValid,
            @RequestParam(value = "type", required = false) String couponType,
            @RequestParam("category") String category){
        return "Query Parameter valid = " + isValid
                + " | Coupon Type = " + couponType
                + " | Coupon Category = " + category;
    }
    // HTTP Methods Get
    @GetMapping("getCoupon")
    public String newCoupon(){
        System.out.println("/getCoupon invoked");
        return "New Coupon : " + couponService.newCoupon();
    }

    @GetMapping("getJson")
    public Coupon getDummyJson(){
        System.out.println("/getJson invoked");
        return Coupon.builder()
                .id(couponService.newCoupon())
                .type("Voucher")
                .validFor(3).build();
    }

    @GetMapping("getMultipleCoupons")
    public List<String> newCouponWithQuantity(){
        System.out.println("/getMultipleCoupons invoked");
        int quantity = 10;
        return couponService.getNewCoupon(quantity);
    }
    // http://localhost:8082/app-name/coupon/getCoupon
}
