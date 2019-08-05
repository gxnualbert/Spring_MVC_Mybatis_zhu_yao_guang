package cn.itcast.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @auther gxnulizzie
 * @create 2019-08-05-11:34
 */
@Data
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;

    // private User user;
    private List<User> list;
    private Map<String,User> map;

}
