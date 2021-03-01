<%--
  Created by IntelliJ IDEA.
  User: cpucode
  Date: 2021/2/28
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <%
        response.sendRedirect(request.getContextPath() + "/pages/main.jsp");
    %>

</body>
</html>
