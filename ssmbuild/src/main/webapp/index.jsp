<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/28 0028
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
        }

        a {
            text-decoration: none;
            color: black;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表</a>
    <a href="${pageContext.request.contextPath}/user/login">登录</a>
</h3>
</body>
</html>
