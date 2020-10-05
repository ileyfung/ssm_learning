<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/8/29 0029
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <h1>Login</h1>
        <h4 style="color: red">
            <c:if test="${not empty error}">
                ${error}
            </c:if>
        </h4>
        <form method="post" action="login">
            <table>
                <tr>
                    <td>用户名</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" name="pwd"></td>
                </tr>
                <t>
                    <td colspan="2"><input type="submit" value="login"></td>
                </t>
            </table>
        </form>
    </center>
</body>
</html>
