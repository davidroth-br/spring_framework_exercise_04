package com.montrealcollege.exercise4.entities;

import java.util.Date;

public class Program {

    private String name;
    private Integer duration;
    private Date startDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void init() {
        startDate = new Date();
    }
}
