package cn.com.mybatis.po;

import java.util.List;

import lombok.Data;

@Data
public class BatchDetail {
    private int id;
    private int batch_id;
    private int product_id;
    private int product_num;
    private FinacialProduct finacialProduct;
}
