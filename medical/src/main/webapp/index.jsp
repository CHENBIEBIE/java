<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/2.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body>
<div class="container">

    <div class="login_warper">
        <form action="/user/home">
            <legend>KaiShengIT</legend>
            <label>账号</label>
            <input type="text">
            <label>密码</label>
            <input type="password">
            <div class="form-actions">
                <button class="button button-flat-action">进入系统</button>
            </div>
        </form>
    </div>

</div>


<script src="http://cdn.staticfile.org/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/twitter-bootstrap/3.0.0/js/bootstrap.min.js"></script>


</body>
</html>
