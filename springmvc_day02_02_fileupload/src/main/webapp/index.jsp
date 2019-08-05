<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/5
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>传统方式文件上传</h3>
<br>
enctype="multipart/form-data": 表示把表单分成几个部分做文件上传<br/>
前端把数据发送给服务器是，所有的表单内容都被封装到request对象中<br/><br/><br/>
<form action="user/fileupload1" method="post" enctype="multipart/form-data">
    选择文件<input type="file" name="upload"/><br>
    <input type="submit" value="传统上传"/>
</form>

<br/><br/><br/>
<h3>Spring MVC 方式文件上传</h3>
<form action="user/fileupload2" method="post" enctype="multipart/form-data">
    选择文件<input type="file" name="upload"/><br>
    <input type="submit" value="spring mvc 上传"/>
</form>
<br/><br/><br/>
<h3>跨文件服务器方式文件上传</h3>
<form action="user/fileupload3" method="post" enctype="multipart/form-data">
    选择文件<input type="file" name="upload"/><br>
    <input type="submit" value="跨服务器上传"/>
</form>
</body>
</html>