package com.common.mpg.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Zhangh implements Serializable {
    private Integer zhangh;

    private Integer userid;

    private BigDecimal zhhuye;

    private BigDecimal shciye;

    private Date weihrq;

    private static final long serialVersionUID = 1L;

    public Integer getZhangh() {
        return zhangh;
    }

    public void setZhangh(Integer zhangh) {
        this.zhangh = zhangh;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public BigDecimal getZhhuye() {
        return zhhuye;
    }

    public void setZhhuye(BigDecimal zhhuye) {
        this.zhhuye = zhhuye;
    }

    public BigDecimal getShciye() {
        return shciye;
    }

    public void setShciye(BigDecimal shciye) {
        this.shciye = shciye;
    }

    public Date getWeihrq() {
        return weihrq;
    }

    public void setWeihrq(Date weihrq) {
        this.weihrq = weihrq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", zhangh=").append(zhangh);
        sb.append(", userid=").append(userid);
        sb.append(", zhhuye=").append(zhhuye);
        sb.append(", shciye=").append(shciye);
        sb.append(", weihrq=").append(weihrq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Zhangh other = (Zhangh) that;
        return (this.getZhangh() == null ? other.getZhangh() == null : this.getZhangh().equals(other.getZhangh()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getZhhuye() == null ? other.getZhhuye() == null : this.getZhhuye().equals(other.getZhhuye()))
            && (this.getShciye() == null ? other.getShciye() == null : this.getShciye().equals(other.getShciye()))
            && (this.getWeihrq() == null ? other.getWeihrq() == null : this.getWeihrq().equals(other.getWeihrq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZhangh() == null) ? 0 : getZhangh().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getZhhuye() == null) ? 0 : getZhhuye().hashCode());
        result = prime * result + ((getShciye() == null) ? 0 : getShciye().hashCode());
        result = prime * result + ((getWeihrq() == null) ? 0 : getWeihrq().hashCode());
        return result;
    }
}