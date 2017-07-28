package com.huitu.api.hnsl.entity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FbBrrealR extends FbBrrealRKey {
    private String adnm;

    private String brtp;

    private String stnm;

    private Date tm;

    private BigDecimal z;

    private BigDecimal wz;

    private BigDecimal dvl;

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public String getBrtp() {
        return brtp;
    }

    public void setBrtp(String brtp) {
        this.brtp = brtp;
    }

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getTm() {
        SimpleDateFormat  aa=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(tm!=null){
            return aa.format(tm);
        }else{
            return "";
        }
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getWz() {
        return wz;
    }

    public void setWz(BigDecimal wz) {
        this.wz = wz;
    }

    public BigDecimal getDvl() {
        return dvl;
    }

    public void setDvl(BigDecimal dvl) {
        this.dvl = dvl;
    }
}