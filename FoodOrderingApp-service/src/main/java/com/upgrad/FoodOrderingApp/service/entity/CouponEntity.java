package com.upgrad.FoodOrderingApp.service.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "coupon")
@NamedQueries({
        @NamedQuery(name="getCouponByName", query = "SELECT c FROM CouponEntity c WHERE c.couponName = :couponName"),
        @NamedQuery(name="getCouponById", query = "SELECT c FROM CouponEntity c WHERE c.uuid = :couponUUID")
})

public class CouponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "uuid")
    @NotNull
    @Size(max = 200)
    private String uuid;

    @Column(name = "coupon_name")
    @NotNull
    @Size(max = 255)
    private String couponName;

    @Column(name = "percent")
    private Integer percent;

    //Constructor

    public CouponEntity() {

    }

    public CouponEntity(@NotNull @Size(max = 200) String uuid, @NotNull @Size(max = 255) String couponName, Integer percent) {
        this.uuid = uuid;
        this.couponName = couponName;
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
