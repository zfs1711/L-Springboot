package com.zfs.springboot.model;

import java.io.Serializable;

public class admininfo implements Serializable {
    private Integer aid;

    private String aname;

    private String apwd;

    private String alevel;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getAlevel() {
        return alevel;
    }

    public void setAlevel(String alevel) {
        this.alevel = alevel;
    }
}