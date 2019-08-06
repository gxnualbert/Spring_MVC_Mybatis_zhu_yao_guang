package cn.gxnualbert.controller;

import cn.gxnualbert.domain.Account;
import cn.gxnualbert.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @auther gxnualbert
 * @create 2019-08-06-13:55
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {

        System.out.println("现在执行的是spring mvc中 Controller相关的方法。。。。。");
        List<Account> list=accountService.findAll();

        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public void  save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        System.out.println("执行新增方法了");
        //账号插入完成之后，就跳转到查询页面，将所有数据查询出来
        response.sendRedirect(request.getContextPath()+"/account/findAll"); //
    }
}
