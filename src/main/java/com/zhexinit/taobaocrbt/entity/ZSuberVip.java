package com.zhexinit.taobaocrbt.entity;

import java.util.Date;

public class ZSuberVip {
    private Integer id;

    private String suberId;

    private String nickName;

    private String mdn;

    private String password;

    private String icon;

    private Boolean gender;

    private String childNickName;

    private Boolean childGender;

    private Date childBirthday;

    private String channelCode;

    private Integer vipType;

    private Date vipExpiryTime;

    private String suberType;

    private String tokenId;

    private Boolean loginFlag;

    private Boolean isBlack;

    private Date createTime;

    private Date modifyTime;

    private Boolean deleteFlag;

    private String lastImei;

    private Date lastActiveTime;

    private Integer costPrice;

    private String distId;

    private String registerType;

    private String registerProvince;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuberId() {
        return suberId;
    }

    public void setSuberId(String suberId) {
        this.suberId = suberId == null ? null : suberId.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn == null ? null : mdn.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getChildNickName() {
        return childNickName;
    }

    public void setChildNickName(String childNickName) {
        this.childNickName = childNickName == null ? null : childNickName.trim();
    }

    public Boolean getChildGender() {
        return childGender;
    }

    public void setChildGender(Boolean childGender) {
        this.childGender = childGender;
    }

    public Date getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(Date childBirthday) {
        this.childBirthday = childBirthday;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public Integer getVipType() {
        return vipType;
    }

    public void setVipType(Integer vipType) {
        this.vipType = vipType;
    }

    public Date getVipExpiryTime() {
        return vipExpiryTime;
    }

    public void setVipExpiryTime(Date vipExpiryTime) {
        this.vipExpiryTime = vipExpiryTime;
    }

    public String getSuberType() {
        return suberType;
    }

    public void setSuberType(String suberType) {
        this.suberType = suberType == null ? null : suberType.trim();
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public Boolean getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(Boolean loginFlag) {
        this.loginFlag = loginFlag;
    }

    public Boolean getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Boolean isBlack) {
        this.isBlack = isBlack;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getLastImei() {
        return lastImei;
    }

    public void setLastImei(String lastImei) {
        this.lastImei = lastImei == null ? null : lastImei.trim();
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getDistId() {
        return distId;
    }

    public void setDistId(String distId) {
        this.distId = distId == null ? null : distId.trim();
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType == null ? null : registerType.trim();
    }

    public String getRegisterProvince() {
        return registerProvince;
    }

    public void setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince == null ? null : registerProvince.trim();
    }
}