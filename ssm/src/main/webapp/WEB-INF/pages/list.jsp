<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询所有的帐户</h3>

<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>


<br/><br/><br/><br/>
<h3>新增用户信息</h3>
<form action="save" method="post">

    姓名：<input type="text" name="name"><br/><br/>
    金额：<input type="text" name="money"><br/>
    <input type="submit"  value="提交">


</form>


</body>
</html>
