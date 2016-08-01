<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/2.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdn.staticfile.org/font-awesome/4.1.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body>

<div class="navbar navbar-static-top">
    <div class="navbar-inner">
        <a class="brand" href="#">凯盛医疗</a>
        <ul class="nav">
            <li ><a href="home.html"><i class="fa fa-home"></i> 首页</a></li>
            <li class="active"><a href="/patient/home"><i class="fa fa-building"></i> 病人档案</a></li>
            <li><a href="#"><i class="fa fa-stethoscope"></i>  就诊记录</a></li>
            <li><a href="#"><i class="fa fa-bell-o"></i> 复诊提醒</a></li>
            <li><a href="#"><i class="fa fa-bar-chart-o"></i> 数据统计</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" ><i class="fa fa-cogs"></i> 系统设置 <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href=""><i class="fa fa-sitemap"></i> 科室设置</a></li>
                    <li><a href=""><i class="fa fa-medkit"></i> 病种设置</a></li>
                    <li><a href=""><i class="fa fa-bars"></i> 医保类型设置</a></li>
                    <li><a href=""><i class="fa fa-child"></i> 患者状态设置</a></li>
                    <li class="divider"></li>
                    <li><a href="/account/list"><i class="fa fa-user-md"></i> 账号设置</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav pull-right">
            <li class="divider-vertical"></li>
            <li><a href="#"><i class="fa fa-cog"></i> 个人设置</a></li>
        </ul>
    </div>
</div>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">

            <div class="box">
                <div class="box-header">
                    <span class="title">搜索</span>
                </div>
                <div class="box-body search-box">
                    <form action="" class="form-search">
                        <input type="text" placeholder="姓名">
                        <input type="text" placeholder="身份证号">
                        <input type="text" placeholder="电话">
                        <button class="button button-flat-primary button-pill"><i class="fa fa-search"></i> 搜索</button>
                    </form>
                </div>
            </div>




            <div class="box">
                <div class="box-header">
                    <span class="title"><i class="fa fa-building"></i> 患者列表</span>
                    <ul class="unstyled inline pull-right">
                        <li><a href="/patient/new"><i class="fa fa-plus"></i> 新建</a></li>
                    </ul>
                </div>
                <div class="box-body">
                    <table class="table">
                        <thead>
                        <tr>
                            <%--<th width="20">
                                 <input type="checkbox" name="" id="">
                            </th>--%>
                            <th width="100">姓名</th>
                            <th width="50">性别</th>
                            <th width="150">电话</th>
                            <th width="200">医保类型</th>
                            <th>地址</th>
                            <th width="50">状态</th>
                            <th width="100">创建日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <%--<td>
                                <input type="checkbox" name="" id="">
                            </td>--%>
                            <td><a href="/patient/list">张晓明</a></td>
                            <td>男</td>
                            <td>13898767098</td>
                            <td>市职工医保</td>
                            <td>解放区普希顿小区4号楼</td>
                            <td>在诊</td>
                            <td>2014-07-09</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>


        </div>

    </div>
</div>



<script src="http://cdn.staticfile.org/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/twitter-bootstrap/3.0.0/js/bootstrap.min.js"></script>

</body>
</html>
