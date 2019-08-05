<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/3
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <h3>入门程序</h3>
    <a href="user/hello">点击我跳转</a>
    <br/>
    <br/>
    <a href="user/testRequestMapping?username=heihei">RequestMapping注解</a>
    <br/>
    <br/>
    <a href="anno/showAnnoIndex">Anno注解页面跳转</a>
<%--        请求的参数跟controller要求的参数对不上，会报错
    <a href="user/testRequestMapping?username=heidsdshei">RequestMapping注解</a>--%>
    <br/>
    <br/>
    <a href="param/showParamIndex">请求参数绑定详情 页</a>
</head>
<body>

</body>
</html>
