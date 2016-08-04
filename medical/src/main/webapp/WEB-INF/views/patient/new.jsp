<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/2.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdn.staticfile.org/font-awesome/4.1.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/static/js/simditor/styles/simditor.css">
    <link rel="stylesheet" href="http://cdn.staticfile.org/select2/3.4.8/select2.css">
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body>

<%@include file="../header.jsp"%>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">

            <div class="box">
                <div class="box-header">
            <span class="title">
              <i class="fa fa-plus"></i>
              <a href="patient-list.html"> 患者列表</a>  /  新增患者
            </span>
                </div>
                <div class="box-body form">
                    <form action="">
                        <label>姓名</label>
                        <input type="text">
                        <label>性别</label>
                        <select name="" id="">
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                        <label>身份证号</label>
                        <input type="text">
                        <label>年龄</label>
                        <input type="text">
                        <label>电话</label>
                        <input type="text">
                        <label>医保类型</label>
                        <select name="" id="yb">
                            <option value=""></option>
                            <option value="">市医保</option>
                            <option value="">新农合</option>
                        </select>
                        <label>住址</label>
                        <input type="text">
                        <label>过敏史</label>
                        <textarea  class="editor1" style="height:50px"></textarea>
                        <label>备注</label>
                        <textarea  class="editor2"></textarea>
                        <div class="form-actions">
                            <button class="button button-flat-action button-pill">保存</button>
                        </div>
                    </form>
                </div>
            </div>


        </div>

    </div>
</div>



<script src="http://cdn.staticfile.org/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/twitter-bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="/static/js/simditor/scripts/js/simditor-all.min.js"></script>
<script src="http://cdn.staticfile.org/select2/3.4.8/select2.min.js"></script>
<script>
    $(function(){

        var editor = new Simditor({
            toolbar:['title','bold','italic','underline','strikethrough','ol','ul','blockquote','table','link','hr','indent','outdent'],
            textarea: $('.editor1')
        });
        var editor2 = new Simditor({
            toolbar:['title','bold','italic','underline','strikethrough','ol','ul','blockquote','table','link','hr','indent','outdent'],
            textarea: $('.editor2')
        });
        $("#yb").select2({
            placeholder: "请选择医保类型",
            width:'220px'
        });

    });
</script>

</body>
</html>
