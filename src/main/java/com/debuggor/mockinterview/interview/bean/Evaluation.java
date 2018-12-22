package com.debuggor.mockinterview.interview.bean;

import java.util.Date;

public class Evaluation {
    // 评价ID
    private Integer eid;
    // 内容
    private String comment;
    // 评星
    private Integer grade;
    // 面试官ID
    private Integer iid;
    // 评价者ID
    private Integer fid;
    //评价者Finder
    private Finder finder;
    // 订单ID
    private Integer oid;
    // 创建时间
    private Date createTime;

    @Override
    public String toString() {
        return "Evaluation{" +
                "eid=" + eid +
                ", comment='" + comment + '\'' +
                ", grade=" + grade +
                ", iid=" + iid +
                ", fid=" + fid +
                ", oid=" + oid +
                ", createTime=" + createTime +
                '}';
    }

    public Finder getFinder() {
        return finder;
    }

    public void setFinder(Finder finder) {
        this.finder = finder;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
