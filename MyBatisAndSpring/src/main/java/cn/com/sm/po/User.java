package cn.com.sm.po;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class User implements Serializable{
    private int id;
    private String username;
    private String password;
    private String gender;
    private String email;
    private String province;
    private String city;
    private Date birthday;
}
