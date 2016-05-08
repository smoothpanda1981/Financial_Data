package com.yan.wang.financialdata.model;

import javax.persistence.*;

/**
 * Created by ywang on 07.05.16.
 */
@Entity
@Table(name="REPORT")
public class Report {
    private Long id;
    private String Date;
    private String Impressions;
    private String Clicks;
    private String Earning;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Column
    public String getImpressions() {
        return Impressions;
    }

    public void setImpressions(String impressions) {
        Impressions = impressions;
    }

    @Column
    public String getClicks() {
        return Clicks;
    }

    public void setClicks(String clicks) {
        Clicks = clicks;
    }

    @Column
    public String getEarning() {
        return Earning;
    }

    public void setEarning(String earning) {
        Earning = earning;
    }
}
