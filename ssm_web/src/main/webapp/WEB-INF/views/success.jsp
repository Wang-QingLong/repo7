<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  User: wang
  Date: 2019/11/12
  Time: 1:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>ssm整合</title>
</head>
<body>
<h4>老铁没毛病</h4>

<c:forEach items="${accounts}" var="account">
    ${account.id}<br>
    ${account.name}<br>
    ${account.money}<br>
    ${account.birthday}<br>
    <fmt:formatDate value="${account.birthday}" pattern="yyyy年MM月dd日"/>
</c:forEach>
</body>
</html>
