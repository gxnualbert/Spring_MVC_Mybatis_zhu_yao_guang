<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/5
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--常用的注解--%>

<a href="testRequestParam?name=哈哈">RequestParam</a>

<br>

<form action="testRequestBody" method="post">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>
<a href="testPathVariable/10">testPathVariable</a>

<br>

<a href="testRequestHeader">RequestHeader</a>

<br>

<a href="testCookieValue">CookieValue 获取cookie的值</a>

<br>
<h3>testModelAttribute 测试</h3>
<form action="testModelAttribute" method="post">
    用户姓名：<input type="text" name="uname" /><br/>
    用户年龄：<input type="text" name="age" /><br/>
    <input type="submit" value="提交" />
</form>

<br>

<a href="testSessionAttributes">testSessionAttributes</a><br>
<a href="getSessionAttributes">getSessionAttributes</a><br>
<a href="delSessionAttributes">delSessionAttributes</a>



</body>
</html>
