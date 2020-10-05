<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/30 0030
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍信息</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="form-group">
            <label>书籍ID:</label>
            <input type="text" class="form-control" name="bookID" value="${byId.bookID}" readonly>
        </div>
        <div class="form-group">
            <label>书籍名称:</label>
            <input type="text" class="form-control" name="bookName" value="${byId.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" class="form-control" name="bookCounts" value="${byId.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍详情:</label>
            <input type="text" class="form-control" name="detail" value="${byId.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>
