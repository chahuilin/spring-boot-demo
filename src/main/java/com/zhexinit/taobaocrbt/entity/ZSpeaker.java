package com.zhexinit.taobaocrbt.entity;

import java.util.Date;

public class ZSpeaker implements java.io.Serializable {
    private Integer id;

    private String name;

    private String icon;

    private String title;

    private String summaryShort;

    private String summaryLong;

    private Date createTime;

    private Date modifyTime;

    private Byte state;

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
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummaryShort() {
        return summaryShort;
    }

    public void setSummaryShort(String summaryShort) {
        this.summaryShort = summaryShort == null ? null : summaryShort.trim();
    }

    public String getSummaryLong() {
        return summaryLong;
    }

    public void setSummaryLong(String summaryLong) {
        this.summaryLong = summaryLong == null ? null : summaryLong.trim();
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

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}