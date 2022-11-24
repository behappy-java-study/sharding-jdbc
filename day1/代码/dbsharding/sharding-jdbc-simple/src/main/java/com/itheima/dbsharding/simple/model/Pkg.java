package com.itheima.dbsharding.simple.model;

import java.time.LocalDateTime;

public class Pkg {

    Long id;
    String resort;
    String code;
    LocalDateTime expire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResort() {
        return resort;
    }

    public void setResort(String resort) {
        this.resort = resort;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpire() {
        return expire;
    }

    public void setExpire(LocalDateTime expire) {
        this.expire = expire;
    }
}
