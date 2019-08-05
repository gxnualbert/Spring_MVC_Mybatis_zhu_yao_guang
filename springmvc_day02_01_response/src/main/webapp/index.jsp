<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/5
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery.min.js"></script>
<script>
    // 页面加载，绑定单击事件
    $(function(){
        $("#btn").click(function(){
            alert("hello btn");
            // 发送ajax请求
            $.ajax({
                // 编写json格式，设置属性和值
                url:"user/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"username":"hehe","password":"123","age":30}',
                dataType:"json",
                type:"post",
                success:function(data){
                    // data服务器端响应的json的数据，进行解析
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            });

        });
    });

</script>
<body>

<h3>重定向</h3>
<a href="user/testString">controller返回一个字符串。testString</a>
<br/>
<br/>
<a href="user/testVoid">controller没有返回值，也就是void，testVoid</a>
<br/><br/>
<a href="user/modelAndView">controller返回一个modelndView对象</a>
<br/><br/>
<a href="user/forwardOrRedirect">请求转发或者重定向</a>
<br/><br/><br/><br/>
<button id="btn">发送ajax异步请求</button>
</body>
</html>
