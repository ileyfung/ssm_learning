<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/29 0029
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix"> <%-- 清除浮动--%>
            <div class="col-md-12 column"> <%-- 分12列--%>
                <div class="page-header">
                    <h1>
                        <small>书籍列表 ———————— 显示所有书籍</small>
                    </h1>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-1 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增</a>
            </div>
            <div class="col-md-1 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">显示所有</a>
            </div>
            <div class="col-md-1 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/logout">注销用户</a>
            </div>
            <div class="col-md-9 column">
                <form class="form-search" method="post" action="${pageContext.request.contextPath}/book/searchBook" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input class="input-medium search-query" type="text" name="bookName" required/> <button type="submit" class="btn">查找</button>
                </form>
            </div>
        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <td>书籍编号</td>
                            <td>书籍名称</td>
                            <td>书籍数量</td>
                            <td>书籍详情</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${all}" var="list">
                            <tr>
                                <td>${list.bookID}</td>
                                <td>${list.bookName}</td>
                                <td>${list.bookCounts}</td>
                                <td>${list.detail}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${list.bookID}">更改</a> |
                                    <a href="javascript:if(confirm('确实要删除吗?'))
                                    location='${pageContext.request.contextPath}/book/del?id=${list.bookID}'">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
