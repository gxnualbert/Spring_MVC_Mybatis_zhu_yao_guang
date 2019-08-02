package cn.com.mybatis.po;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class Batch {
    private int batch_id;
    private int cus_id;
    private String number;
    private Date createtime;
    private String note;
    private List<BatchDetail> batchDetials;
}
