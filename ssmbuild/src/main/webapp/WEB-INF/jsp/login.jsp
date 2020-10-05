<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/4 0004
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>
        function check() {
            $.post({
                    url:"${pageContext.request.contextPath}/user/checkLogin",
                    data: {'name':$("#username").val(),'pwd':$("#password").val()},
                    success: function (data) {
                        console.log(data[0]);
                        console.log(data[1]);
                        if (data[0].toString() == "OK") {
                            $("#userinfo").html(data[0]);
                            $("#userinfo").css("color","green");
                        } else {
                            $("#userinfo").html(data[0]);
                            $("#userinfo").css("color","red");
                        }
                        if (data[1].toString() == "OK") {
                            $("#pwdinfo").html(data[1]);
                            $("#pwdinfo").css("color","green");
                        } else {
                            $("#pwdinfo").html(data[1]);
                            $("#pwdinfo").css("color","red");
                        }
                        if (data[0].toString() == "OK" && data[1].toString() == "OK")
                            $(location).attr('href', '${pageContext.request.contextPath}/book/allBook');
                    }
                }
            );


            /*function a1() {
                $.post({
                        url:"${pageContext.request.contextPath}/t4",
                        data: {'name':$("#username").val()},
                        success: function (data) {
                            if (data.toString() == "OK") {
                                $("#userinfo").css("color","green");
                            } else $("#userinfo").css("color","red");
                            $("#userinfo").html(data);
                        }
                    }
                );
            }
            function a2() {
                $.post({
                        url:"${pageContext.request.contextPath}/t4",
                        data: {'pwd':$("#password").val()},
                        success: function (data) {
                            if (data.toString() == "OK") {
                                $("#pwdinfo").css("color","green");
                            } else $("#pwdinfo").css("color","red");
                            $("#pwdinfo").html(data);
                        }
                    }
                );
            }*/
        }
    </script>
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/">--%>
    <table>
        <tr>
            <td>用户名：</td>
            <td>
                <input type="text" id="username"/>
            </td>
            <td>
                <span id="userinfo"></span>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" id="password"/>
            </td>
            <td>
                <span id="pwdinfo"></span>
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="登录" onclick="check()">
            </td>
        </tr>
    </table>
<%--</form>--%>
</body>
</html>
