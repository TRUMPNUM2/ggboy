package com.peiyu.mem.domian.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/23.
 * 积分规则(主表)
 */
public class MemPointRule implements Serializable {
    /**
     *记录编号<br/>
     **/
    private Long id;

    private String uid;

    /**
     *生日积分倍数<br/>
     **/
    private Double birthMul;

    /**
     *会员生日月积分倍数<br/>
     **/
    private Double monthMul;

    /**
     *生日积分倍数标记<br/>
     **/
    private Integer birthFlag;

    /**
     *每月第几天双倍积分<br/>
     **/
    private Integer dayValue;

    /**
     *会员生日月积分倍数标记<br/>
     **/
    private Integer monthFlag;

    /**
     *每月第几天积分倍数<br/>
     **/
    private Double dayMul;

    /**
     *每月第几天的标记<br/>
     **/
    private Integer dayFlag;

    /**
     *星期几<br/>
     **/
    private Integer weekValue;

    /**
     *星期几积分倍数<br/>
     **/
    private Double weekMul2;

    /**
     *星期几的标记<br/>
     **/
    private Double weekFlag;

    /**
     *每单按整数累加积分<br/>
     **/
    private Integer pointIntFlag;

    /**
     *0固定积分  1消费次数积分 2单品积分值积分  3整单分段积分   4整单满额积分  5按各类别消费金额积分  6按各品牌消费金额积分   7 按供应商消费金额积分<br/>
     **/
    private Integer ptype;

    /**
     *商家ID<br/>
     **/
    private Long vendorId;

    /**
     *会员类别<br/>
     **/
    private String memCatCode;

    /**
     *满多少元<br/>
     **/
    private Double amount;

    /**
     *积分多少分<br/>
     **/
    private Double point;

    /**
     *是否已删除1删除 0正常<br/>
     **/
    private Integer df;

    /**
     *备注<br/>
     **/
    private String memo;

    /**
     *创建日期<br/>
     **/
    private Date createDate;

    /**
     *修改日期<br/>
     **/
    private Date modifyDate;

    /**
     *创建人<br/>
     **/
    private String creator;

    /**
     *最后修改人<br/>
     **/
    private String mender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mempointrule
     *
     * @mbggenerated Tue Jun 23 16:01:56 GMT+08:00 2015
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getBirthMul() {
        return birthMul;
    }

    public void setBirthMul(Double birthMul) {
        this.birthMul = birthMul;
    }

    public Double getMonthMul() {
        return monthMul;
    }

    public void setMonthMul(Double monthMul) {
        this.monthMul = monthMul;
    }

    public Integer getBirthFlag() {
        return birthFlag;
    }

    public void setBirthFlag(Integer birthFlag) {
        this.birthFlag = birthFlag;
    }

    public Integer getDayValue() {
        return dayValue;
    }

    public void setDayValue(Integer dayValue) {
        this.dayValue = dayValue;
    }


    public Integer getMonthFlag() {
        return monthFlag;
    }

    public void setMonthFlag(Integer monthFlag) {
        this.monthFlag = monthFlag;
    }


    public Double getDayMul() {
        return dayMul;
    }

    public void setDayMul(Double dayMul) {
        this.dayMul = dayMul;
    }

    public Integer getDayFlag() {
        return dayFlag;
    }

    public void setDayFlag(Integer dayFlag) {
        this.dayFlag = dayFlag;
    }

    public Integer getWeekValue() {
        return weekValue;
    }

    public void setWeekValue(Integer weekValue) {
        this.weekValue = weekValue;
    }
    public Double getWeekMul2() {
        return weekMul2;
    }

    public void setWeekMul2(Double weekMul2) {
        this.weekMul2 = weekMul2;
    }

    public Double getWeekFlag() {
        return weekFlag;
    }

    public void setWeekFlag(Double weekFlag) {
        this.weekFlag = weekFlag;
    }

    public Integer getPointIntFlag() {
        return pointIntFlag;
    }

    public void setPointIntFlag(Integer pointIntFlag) {
        this.pointIntFlag = pointIntFlag;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getMemCatCode() {
        return memCatCode;
    }

    public void setMemCatCode(String memCatCode) {
        this.memCatCode = memCatCode == null ? null : memCatCode.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }
    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getMender() {
        return mender;
    }

    public void setMender(String mender) {
        this.mender = mender == null ? null : mender.trim();
    }
}
