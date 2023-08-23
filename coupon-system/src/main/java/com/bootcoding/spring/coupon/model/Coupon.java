package com.bootcoding.spring.coupon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "Coupon-application")
public class Coupon {
    @Id
    @Generated
    private String id;
    private String title;
    private String description;
    private String couponCode;
    @Column(name = "Valid_date")
    private Date validDate;
    private int discount;
    private String category;
    @Column(name = "Created_date")
    private Date createdDate;
    private String createdBy;
    private Boolean active;
    private String status;
    private String type;
    private int validFor;


}
