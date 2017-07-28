package com.huitu.api.hnsl.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StStcntdtlR {
    private String stcd;

    private String adcd;

    private String adnm;

    private String stnm;

    private Date trctm;

    private Date yrctm;

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getAdcd() {
        return adcd;
    }

    public void setAdcd(String adcd) {
        this.adcd = adcd;
    }

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getTrctm() {
        SimpleDateFormat aa=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(trctm!=null){
            return aa.format(trctm);
        }else{
            return "";
        }
    }

    public void setTrctm(Date trctm) {
        this.trctm = trctm;
    }

    public Date getYrctm() {
        return yrctm;
    }

    public void setYrctm(Date yrctm) {
        this.yrctm = yrctm;
    }
}