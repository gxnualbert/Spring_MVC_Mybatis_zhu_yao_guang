package cn.gxnualbert.controller;

import cn.gxnualbert.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther gxnualbert
 * @create 2019-08-05-21:57
 */

@Controller
@RequestMapping("/user")
public class UserCotroller {
//    //原始异常直接抛出到web界面版
//    @RequestMapping("/testException")
//    public String testException() {
//        System.out.println("testException 执行了");
//        int a = 10 / 0;
//        return "success";
//    }

    //包装异常信息后，再返回给前端版
    @RequestMapping("/testException")
    public String testException() throws  SysException {
        System.out.println("testException 执行了");

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("查询用户出错了");
        }

        return "success";
    }
}
