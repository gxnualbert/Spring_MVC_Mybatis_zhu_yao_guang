package cn.com.mybatis.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private String gender;
    private String email;
    private String province;
    private String city;
    private Date birthday;

    public User(){

    }

    public User(int id, String username, String password, String gender,
                String email, String province, String city, Date birthday) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.province = province;
        this.city = city;
        this.birthday = birthday;
    }
}
