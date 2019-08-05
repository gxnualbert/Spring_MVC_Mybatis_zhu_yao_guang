package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @auther gxnulizzie
 * @create 2019-08-05-13:37
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 获显示Anno首页
     * @return
     */
    @RequestMapping(value="/showParamIndex")
    public String showParamIndex() {
        return "param";
    }

    /**
     * 请求参数绑定入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password) {
        System.out.println("执行了...获取附带在URL中的请求参数");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        return "success";
    }
    /**
     * 请求参数绑定把数据封装到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了...请求参数绑定把数据封装到JavaBean的类中");
        System.out.println(account);
        return "success";
    }
    /**
     * 原生的API
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了...");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }
}
