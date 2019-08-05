<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/5
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这个页面是由controller从定向过来的。<br/>对应的controller 是testVoid。<br/>

<h3>如果controller的返回值是void，那么有两种方法进行页面转发：请求转发和重定向</h3>
//编写请求转发发的程序<br/>
//        try {<br/>
//            request.getRequestDispatcher("/WEB-INF/pages/return_void.jsp").forward(request,response);<br/>
//        } catch (ServletException e) {<br/>
//            e.printStackTrace();<br/>
//        } catch (IOException e) {<br/>
//            e.printStackTrace();<br/>
//        }<br/>
<br/>
//编写重定向的程序<br/>
try {<br/>
response.sendRedirect(request.getContextPath()+"/index.jsp");<br/>
} catch (IOException e) {<br/>
e.printStackTrace();<br/>
}<br/>
}<br/><br/>
</body>
</html>
