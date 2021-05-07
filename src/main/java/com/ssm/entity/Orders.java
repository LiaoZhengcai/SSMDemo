package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Orders {
    private int oid;
    private String oname;
    private Date otime;
    private User user;

    public Orders() {
    }

    public Orders(int oid, String oname, Date otime, User user) {
        this.oid = oid;
        this.oname = oname;
        this.otime = otime;
        this.user = user;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", otime=" + otime +
                ", user=" + user +
                '}';
    }
}
