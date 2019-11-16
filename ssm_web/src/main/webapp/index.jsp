<%--
  User: wang
  Date: 2019/11/12
  Time: 1:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm整合入口</title>
</head>
<body>
<a href="wang/findAllTest.do"><h4>查询所有数据</h4></a>
<hr>
<form action="wang/insertTest.do" method="post">
    姓名: <input type="text" name="name"><br>
    资产: <input type="text" name="money"><br>
    生日: <input type="text" name="birthday"><br>
    <input type="submit" value="提交按钮"><br>
</form>
</body>
</html>
