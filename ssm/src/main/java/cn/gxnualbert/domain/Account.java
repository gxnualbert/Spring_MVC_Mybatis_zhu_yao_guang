package cn.gxnualbert.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @auther gxnualbert
 * @create 2019-08-06-13:27
 */
@Data
@AllArgsConstructor
@ToString
public class Account implements Serializable {

    private Integer id;
    private  String name;
    private Double money;

}
