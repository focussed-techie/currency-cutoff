package com.jpmorgan.currency.cutoff.model;


import javax.persistence.*;

@Entity
@Table(name = "CURRENCY_CUTOFF")
public class CurrencyCutOff {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;

    @Column(name = "CURRENCY_CODE")
    private String currencyCode;


    @Column(name="CURRENCY_ID")
    private long currencyId;

    @Column(name="CURRENCY_NAME")
    private String name;

    @Column(name="BRANCH")
    private String branch;

    @Column(name="CURRENCY_CUTOFF_HOUR")
    private String cutoffHour;

    @Column(name="CURRENCY_CUTOFF_MIN")
    private String cutOffMin;



    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCutoffHour() {
        return cutoffHour;
    }

    public void setCutoffHour(String cutoffHour) {
        this.cutoffHour = cutoffHour;
    }

    public String getCutOffMin() {
        return cutOffMin;
    }

    public void setCutOffMin(String cutOffMin) {
        this.cutOffMin = cutOffMin;
    }
}
