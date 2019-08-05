package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther gxnualbert
 * @create 2019-08-05-14:41
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了、、、、");
//        模拟从数据库中取出一个对象，然后传到页面
        User user=new User();
        user.setAge(18);
        user.setPassword("1234");
        user.setUsername("开到哪");
//        将从数据库中拿到的对象，存入model中,然后，跳转到success的jsp页面中，就可以通过model直接取对象的值
        model.addAttribute("user",user);
        return  "success";
    }
}
