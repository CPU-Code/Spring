<%--
  Created by IntelliJ IDEA.
  User: cpucode
  Date: 2021/2/22
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();

        userList.push({username:"cpuCode", age:22});
        userList.push({username:"code", age: 30});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/getController/save4",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        });
    </script>

</head>
<body>

</body>
</html>
