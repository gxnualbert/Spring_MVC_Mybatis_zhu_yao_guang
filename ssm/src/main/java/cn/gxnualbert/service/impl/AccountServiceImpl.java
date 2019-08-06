package cn.gxnualbert.service.impl;

import cn.gxnualbert.dao.AccountDao;
import cn.gxnualbert.domain.Account;
import cn.gxnualbert.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther gxnualbert
 * @create 2019-08-06-13:52
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("这是业务层的代码，正在执行操作：查询所有账户。。。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("这是业务层的代码，正在执行操作：保存账户、、、、、、");
        accountDao.saveAccount(account);
    }
}
