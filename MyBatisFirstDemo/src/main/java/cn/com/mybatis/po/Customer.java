package cn.com.mybatis.po;


import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class Customer implements Serializable {
    private int cus_id;
    private String username;
    private String acno;
    private String gender;
    private String phone;
    private List<Batch> batchList;
}
