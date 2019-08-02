package cn.com.mybatis.po;


import java.util.Date;
import lombok.Data;

@Data
public class FinacialProduct {

    private int id;
    private String name;
    private double price;
    private String detail;
    private String imgpath;
    private Date invattime;
}
