package cn.gxnualbert.test;

import cn.gxnualbert.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther gxnualbert
 * @create 2019-08-06-14:10
 */
public class TestSpring {

    @Test
    public void test1(){
//        加载配置文件
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

//        获取对象
       AccountService as=(AccountService) applicationContext.getBean("accountService");
//                调用方法
        as.findAll();

    }

}
