<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30 0030
  Time: 下午 2:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span>${param.mess}</span>
    <form action="${pageContext.request.contextPath}/loginAction/dologin" method="post">
        工号：<input name="d_ID"><br>
        密码：<input name="d_pwd"><br>
        <input type="submit">
    </form>
</body>
</html>
