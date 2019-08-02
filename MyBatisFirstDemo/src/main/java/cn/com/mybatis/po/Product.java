package cn.com.mybatis.po;


import java.util.List;
import lombok.Data;

@Data
public class Product {
    //商品id
    private int pid;
    //商品名称
    private String pname;
    //给商品点赞的用户
    private List<User> users;
}
