<%--
  Created by IntelliJ IDEA.
  User: cpucode
  Date: 2021/2/22
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/getController/save3" method="post">
        <input type="text" name="userList[0].username"> <br/>
        <input type="text" name="user.List[0].age"> <br/>
        <input type="text" name="user.List[1].username"> <br/>
        <input type="text" name="user.List[1].age"> <br/>

        <input type="submit" value="提交">
    </form>
</body>
</html>
