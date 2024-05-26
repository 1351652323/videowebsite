package com.kaiguo.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户(User)实体类
 *
 * @author makejava
 * @since 2022-03-04 18:09:51
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {
    private static final long serialVersionUID = 458367160818936927L;
    
    private Integer id;
    /**
    * 用户名
    */
    private String name;
    /**
    * 头像链接
    */
    private String avatar;
    /**
    * 简介
    */
    private String intro;
    /**
    * 手机号
    */
    private String phone;
    /**
    * 是否绑定手机号
    */
    private Object phoneLinked;
    /**
    * 微信openid
    */
    private String openid;
    /**
    * 是否绑定微信号
    */
    private Object wechatLinked;
    /**
    * 关注数
    */
    private Integer followingCount;
    /**
    * 粉丝数
    */
    private Integer followersCount;
    /**
    * 创建时间
    */
    private Date createdAt;
    /**
    * 更新时间
    */
    private Date updatedAt;
    /**
    * 删除时间
    */
    private Date deletedAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getPhoneLinked() {
        return phoneLinked;
    }

    public void setPhoneLinked(Object phoneLinked) {
        this.phoneLinked = phoneLinked;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Object getWechatLinked() {
        return wechatLinked;
    }

    public void setWechatLinked(Object wechatLinked) {
        this.wechatLinked = wechatLinked;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

}