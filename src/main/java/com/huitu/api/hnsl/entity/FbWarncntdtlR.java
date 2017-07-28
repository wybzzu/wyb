package com.huitu.api.hnsl.entity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FbWarncntdtlR extends FbWarncntdtlRKey {
    private String adnm;

    private BigDecimal lgtd;

    private BigDecimal lttd;

    private String warntypenm;

    private String warngradenm;

    private String warnstatusnm;

    private Date warnstm;

    private Date warnetm;

    private String warnnm;

    private String warndesc;

    private String nt;

    private String padnm;

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public BigDecimal getLgtd() {
        return lgtd;
    }

    public void setLgtd(BigDecimal lgtd) {
        this.lgtd = lgtd;
    }

    public BigDecimal getLttd() {
        return lttd;
    }

    public void setLttd(BigDecimal lttd) {
        this.lttd = lttd;
    }

    public String getWarntypenm() {
        return warntypenm;
    }

    public void setWarntypenm(String warntypenm) {
        this.warntypenm = warntypenm;
    }

    public String getWarngradenm() {
        return warngradenm;
    }

    public void setWarngradenm(String warngradenm) {
        this.warngradenm = warngradenm;
    }

    public String getWarnstatusnm() {
        return warnstatusnm;
    }

    public void setWarnstatusnm(String warnstatusnm) {
        this.warnstatusnm = warnstatusnm;
    }

    public String getWarnstm() {
        SimpleDateFormat aa=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(warnstm!=null){
            return aa.format(warnstm);
        }else{
            return "";
        }
    }

    public void setWarnstm(Date warnstm) {
        this.warnstm = warnstm;
    }

    public Date getWarnetm() {
        return warnetm;
    }

    public void setWarnetm(Date warnetm) {
        this.warnetm = warnetm;
    }

    public String getWarnnm() {
        return warnnm;
    }

    public void setWarnnm(String warnnm) {
        this.warnnm = warnnm;
    }

    public String getWarndesc() {
        return warndesc;
    }

    public void setWarndesc(String warndesc) {
        this.warndesc = warndesc;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public String getPadnm() {
        return padnm;
    }

    public void setPadnm(String padnm) {
        this.padnm = padnm;
    }
}