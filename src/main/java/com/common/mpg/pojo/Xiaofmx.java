package com.common.mpg.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Xiaofmx implements Serializable {
    private Integer zhangh;

    @ApiModelProperty(value = "0-充值，1-消费")
    private Integer xfleix;

    private String zhaiyo;

    private Date xfriqi;

    private Long jioyje;

    private static final long serialVersionUID = 1L;

    public Integer getZhangh() {
        return zhangh;
    }

    public void setZhangh(Integer zhangh) {
        this.zhangh = zhangh;
    }

    public Integer getXfleix() {
        return xfleix;
    }

    public void setXfleix(Integer xfleix) {
        this.xfleix = xfleix;
    }

    public String getZhaiyo() {
        return zhaiyo;
    }

    public void setZhaiyo(String zhaiyo) {
        this.zhaiyo = zhaiyo;
    }

    public Date getXfriqi() {
        return xfriqi;
    }

    public void setXfriqi(Date xfriqi) {
        this.xfriqi = xfriqi;
    }

    public Long getJioyje() {
        return jioyje;
    }

    public void setJioyje(Long jioyje) {
        this.jioyje = jioyje;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", zhangh=").append(zhangh);
        sb.append(", xfleix=").append(xfleix);
        sb.append(", zhaiyo=").append(zhaiyo);
        sb.append(", xfriqi=").append(xfriqi);
        sb.append(", jioyje=").append(jioyje);
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
        Xiaofmx other = (Xiaofmx) that;
        return (this.getZhangh() == null ? other.getZhangh() == null : this.getZhangh().equals(other.getZhangh()))
            && (this.getXfleix() == null ? other.getXfleix() == null : this.getXfleix().equals(other.getXfleix()))
            && (this.getZhaiyo() == null ? other.getZhaiyo() == null : this.getZhaiyo().equals(other.getZhaiyo()))
            && (this.getXfriqi() == null ? other.getXfriqi() == null : this.getXfriqi().equals(other.getXfriqi()))
            && (this.getJioyje() == null ? other.getJioyje() == null : this.getJioyje().equals(other.getJioyje()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZhangh() == null) ? 0 : getZhangh().hashCode());
        result = prime * result + ((getXfleix() == null) ? 0 : getXfleix().hashCode());
        result = prime * result + ((getZhaiyo() == null) ? 0 : getZhaiyo().hashCode());
        result = prime * result + ((getXfriqi() == null) ? 0 : getXfriqi().hashCode());
        result = prime * result + ((getJioyje() == null) ? 0 : getJioyje().hashCode());
        return result;
    }
}