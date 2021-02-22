<%--
  Created by IntelliJ IDEA.
  User: cpucode
  Date: 2021/2/22
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/uploadController/save"
          method="post"
          enctype="multipart/form-data">
        名称 <input type="text" name="username">  <br/>
        文件1 <input type="file" name="uploadFile"> <br/>
        文件2 <input type="file" name="uploadFile2"> <br/>

        <input type="submit" value="提交">
    </form>

    <hr>

    <form action="${pageContext.request.contextPath}/uploadController/save2"
          method="post"
          enctype="multipart/form-data">
        名称 <input type="text" name="username">  <br/>
        文件1 <input type="file" name="uploadFile"> <br/>
        文件2 <input type="file" name="uploadFile2"> <br/>

        <input type="submit" value="提交">
    </form>

</body>
</html>
