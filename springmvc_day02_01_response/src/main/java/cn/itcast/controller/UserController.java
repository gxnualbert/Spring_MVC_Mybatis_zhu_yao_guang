package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther gxnulizzie
 * @create 2019-08-05-14:41
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值是一=个string
     * */
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

    /**
     * 返回值是一个void，就是说，最后一行没有return语句（上面那个方法是有return  "success";页面最后能跳转到jsp页面），然后就不能跳转到相应的jsp页面
     * 解决办法是：编写请求转发
     * 请求转发：一次请求
     * 重定向：两次请求
     * */
//    @RequestMapping("/testVoid")
//    public void testVoid(Model model){
//        System.out.println("testString方法执行了、、、、测试testVoid  ");
//    }
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("testString方法执行了、、、、测试testVoid  ");

        //注意注意
        //1.编写请求转发发的程序
//           request.getRequestDispatcher("/WEB-INF/pages/return_void.jsp").forward(request,response);

        //2.编写重定向的程序
//        response.sendRedirect(request.getContextPath()+"/redirect_page.jsp");
        //3.直接进行响应
        response.setContentType("text/html;chartset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().print("直接响应中文");
        return;

    }

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("modelAndView方法执行了、、、、测试modelAndView  ");
        //创建一个ModelAndView,这个对象是springmvc帮我创建的
        ModelAndView mv=new ModelAndView();
//        模拟从数据库中取出一个对象，然后传到页面
        User user=new User();
        user.setAge(18);
        user.setPassword("1234");
        user.setUsername("返回ModelAndView");
//        把user对象存储到mv对象中，mv的底层实现是把user对象存入request对象中
        mv.addObject("user",user);
        //跳转到哪个页面.ModelAndView 会根据下面set的视图名，结合springmvc.xml中的视图解析器，找到页面
        mv.setViewName("success");

        return mv;

    }

    /**
     * 使用关键字的方式进行转发或者重定向
     * 注意，这里请求转发或者重定向，是不能再使用视图解析器的！！！！！！
     * */
    @RequestMapping("/forwardOrRedirect")
    public String forwardOrRedirect(Model model){
        System.out.println("forwardOrRedirect方法执行了、、、、");
        //使用转发的形势
        return  "forward:/WEB-INF/pages/forward.jsp";
//        使用重定向的形势--这个有问题，测试没通过
//        return  "redirect:forward.jsp";
    }

    /**
     * 使用ajax发送异步请求
     */
    @RequestMapping("/testAjax")
    public @ResponseBody  User testAjax(@RequestBody User user){
        System.out.println("执行了ajax的方法了");

//        这里的user,就是web传过来的User,我们在这里模拟从数据库中取user对象,然后返回去给web端
        user.setUsername("服务器返回来的用户名");
        user.setPassword("12345fsdf");
        return user;
    }

}
