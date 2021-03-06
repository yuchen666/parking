package com.lcr.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
    private String carNumber;
    private String email;
    private String phone;
    private Integer type;
    private String image;
    private String remarks;
}
