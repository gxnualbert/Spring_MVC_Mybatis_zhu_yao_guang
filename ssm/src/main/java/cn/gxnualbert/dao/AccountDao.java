package cn.gxnualbert.dao;

import cn.gxnualbert.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther gxnualbert
 * @create 2019-08-06-13:29
 */
@Repository
public interface AccountDao {


//    mybatis 框架可以直接写接口不用写实现类，它会帮我们生成一个代理对象，然后直接执行，这样我们就不用写实现类了
    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();
    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);




}

