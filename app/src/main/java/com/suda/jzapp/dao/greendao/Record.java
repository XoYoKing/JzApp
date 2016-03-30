package com.suda.jzapp.dao.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "RECORD".
 */
public class Record implements java.io.Serializable {

    private Long id;
    private Long RecordTypeID;
    private Long AccountID;
    private Double RecordMoney;
    private java.util.Date RecordDate;
    private String Remark;
    private Boolean SyncStatus;
    private Boolean isDel;

    public Record() {
    }

    public Record(Long id) {
        this.id = id;
    }

    public Record(Long id, Long RecordTypeID, Long AccountID, Double RecordMoney, java.util.Date RecordDate, String Remark, Boolean SyncStatus, Boolean isDel) {
        this.id = id;
        this.RecordTypeID = RecordTypeID;
        this.AccountID = AccountID;
        this.RecordMoney = RecordMoney;
        this.RecordDate = RecordDate;
        this.Remark = Remark;
        this.SyncStatus = SyncStatus;
        this.isDel = isDel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordTypeID() {
        return RecordTypeID;
    }

    public void setRecordTypeID(Long RecordTypeID) {
        this.RecordTypeID = RecordTypeID;
    }

    public Long getAccountID() {
        return AccountID;
    }

    public void setAccountID(Long AccountID) {
        this.AccountID = AccountID;
    }

    public Double getRecordMoney() {
        return RecordMoney;
    }

    public void setRecordMoney(Double RecordMoney) {
        this.RecordMoney = RecordMoney;
    }

    public java.util.Date getRecordDate() {
        return RecordDate;
    }

    public void setRecordDate(java.util.Date RecordDate) {
        this.RecordDate = RecordDate;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Boolean getSyncStatus() {
        return SyncStatus;
    }

    public void setSyncStatus(Boolean SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

}
