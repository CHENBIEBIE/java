<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/1
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Save user</h3>
<form action="/user/save.do" method="post">
    <input type="text" name="user.username">
    <input type="text" name="user.address">
    <button>Save</button>

</form>
</body>
</html>
