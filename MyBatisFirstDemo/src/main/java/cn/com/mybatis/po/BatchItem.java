package cn.com.mybatis.po;

import java.util.Date;
import java.util.List;
import lombok.Data;


@Data
public class BatchItem {
    private int batch_id;
    private int cus_id;
    private String number;
    private Date createtime;
    private String note;
    private Customer customer;
    //批次包含的理财产品订购信息
    private List<BatchDetail> batchDetails;
}
