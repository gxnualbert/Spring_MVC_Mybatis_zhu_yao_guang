package cn.com.mybatis.po;
import lombok.Data;

@Data
public class UserQueryInfo {
    //在这里包装需要的查询条件

    //用户查询条件
    private UserInstance userInstance;
    //包装其他的查询条件，如购物车、商品信息等
    //......
}
