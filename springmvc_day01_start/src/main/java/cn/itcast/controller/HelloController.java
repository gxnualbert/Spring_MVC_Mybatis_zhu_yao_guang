package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public  String sayHello(){
        System.out.println("hello mvc");
        return "success";
    }

    /**
     * RequestMapping 注解
     * */
    @RequestMapping(value = "testRequestMapping",params = {"username=heihei"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解。。。。");
        return "success";
    }
//    @RequestMapping(value = "anno")
//    public String testAnno(){
//        System.out.println("测试RequestMapping注解。。。。");
//        return "anno";
//    }
}
