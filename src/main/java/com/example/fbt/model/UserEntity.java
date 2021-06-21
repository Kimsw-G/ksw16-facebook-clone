package com.example.fbt.model;

import lombok.Data;

import java.sql.Date;

@Data
public class UserEntity {
    private String iuser;
    private String email;
    private String pw;
    private String nm;
    private String tel;
    private String authcd;
    private Date regdt;
}
