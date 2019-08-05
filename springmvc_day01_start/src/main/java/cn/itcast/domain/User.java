package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
/**
 * @auther gxnulizzie
 * @create 2019-08-05-10:54
 */

@Data
public class User  implements Serializable {
    private String uname;
    private Integer age;
    private Date date;
}
