package cn.itcast.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther gxnulizzie
 * @create 2019-08-05-14:41
 */
@Data
public class User implements Serializable {
    private String username;
    private String password;
    private Integer age;
}
