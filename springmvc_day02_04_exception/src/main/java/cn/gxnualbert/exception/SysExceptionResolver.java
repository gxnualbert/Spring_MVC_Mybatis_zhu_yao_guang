package cn.gxnualbert.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther gxnualbert
 * @create 2019-08-05-22:28
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 处理异常业务逻辑
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,Exception ex){
        SysException e=null;
        if (ex instanceof SysException){
            e= (SysException) ex;
        }else {
            e=new SysException("服务器内部错误，请联系管理员或者相应的开发工程师");
        }
//        创建ModelAndView,跳转到错误提示页面
    ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("errorMsg",e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }

}
